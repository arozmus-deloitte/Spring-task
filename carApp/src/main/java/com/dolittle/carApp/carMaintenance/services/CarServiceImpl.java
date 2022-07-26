package com.dolittle.carApp.carMaintenance.services;

import com.dolittle.carApp.carMaintenance.DAO.CarDAO;
import com.dolittle.carApp.carMaintenance.entities.CarEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dolittle.carApp.carMaintenance.model.CarTO;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private CarDAO carDAO;

    @Autowired
    public CarServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    public List<CarTO> getAllCars() {
        return carDAO.findAll().
                stream()
                .map(this::mapToCarTO)
                .collect(Collectors.toList());
    }

    private CarTO mapToCarTO(CarEntity carEntity) {

        return new CarTO(
                carEntity.getId(),
                carEntity.getType(),
                carEntity.getBrand(),
                carEntity.getYearOfProduction(),
                carEntity.getColor(),
                carEntity.getEngineCapacity(),
                carEntity.getPower(),
                carEntity.getMileage(),
                carEntity.getClientId());
    }

    @Override
    public CarEntity saveCar(CarTO carTO) {
        return carDAO.save(mapToCarEntity(carTO));
    }

    private CarEntity mapToCarEntity(CarTO carTO) {

        return new CarEntity(
                carTO.getId(),
                carTO.getType(),
                carTO.getBrand(),
                carTO.getYearOfProduction(),
                carTO.getColor(),
                carTO.getEngineCapacity(),
                carTO.getPower(),
                carTO.getMileage(),
                carTO.getClientId());
    }


    @Override
    public CarTO searchCarById(long id) throws Exception {
        Optional<CarEntity> findCarTO = carDAO.findById(id);
        if(findCarTO.isPresent())
        {
            return mapToCarTO(findCarTO.get());
        }
        else {
            throw new Exception("Car not found");
        }
    }

    @Override
    public void deleteCar(long id)
    {
        carDAO.deleteById(id);
    }

    @Override
    public void assignClientToCar(CarTO carTO, long clientId) {
        CarEntity carEntity = mapToCarEntity(carTO);
        carEntity.setClientId(clientId);
        carDAO.save(carEntity);
    }

    @Override
    public CarTO searchCarByTypeAndBrand(String type, String brand) throws Exception{
        Optional<CarEntity> findCarTO = carDAO.searchCarByTypeAndBrand(type,brand);
        if(findCarTO.isPresent())
        {
            return mapToCarTO(findCarTO.get());
        }
        else {
            throw new Exception("Car not found");
        }
    }
}
