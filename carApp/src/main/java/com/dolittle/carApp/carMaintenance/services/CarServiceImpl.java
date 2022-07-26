package com.dolittle.carApp.carMaintenance.services;
import com.dolittle.carApp.carMaintenance.DAO.CarDAO;
import com.dolittle.carApp.carMaintenance.entities.CarEntity;
import com.dolittle.carApp.carMaintenance.mapper.Mapper;
import com.dolittle.carApp.carMaintenance.model.ClientTO;
import com.dolittle.carApp.carMaintenance.model.WorkerTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dolittle.carApp.carMaintenance.model.CarTO;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.dolittle.carApp.carMaintenance.mapper.Mapper.*;

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
                .map(Mapper::mapToCarTO)
                .collect(Collectors.toList());
    }

    @Override
    public CarEntity saveCar(CarTO carTO) {
        return carDAO.save(mapToCarEntity(carTO));
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
    public void assignClientToCar(CarTO carTO, ClientTO clientTO) {
        CarEntity carEntity = mapToCarEntity(carTO);
        carEntity.setClientEntity(mapToClientEntity(clientTO));
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

    @Override
    public void assignWorkerToCar(CarTO carTO, WorkerTO workerTO) {
        CarEntity carEntity = mapToCarEntity(carTO);
        carEntity.setWorkerEntity(mapToWorkerEntity(workerTO));
        carDAO.save(carEntity);
    }

}
