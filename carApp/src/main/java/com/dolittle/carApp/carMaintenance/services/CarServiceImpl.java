package com.dolittle.carApp.carMaintenance.services;

import com.dolittle.carApp.carMaintenance.DAO.CarDAO;
import com.dolittle.carApp.carMaintenance.entities.CarEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dolittle.carApp.carMaintenance.model.CarTO;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDAO carDAO;

    public List<CarTO> getAllCars() {
        return carDAO.findAll().
                stream()
                .map(this::mapToCarTO)
                .collect(Collectors.toList());
    }

    private CarTO mapToCarTO(CarEntity carEntity) {
        return new CarTO(carEntity.getId(),
                carEntity.getType(),
                carEntity.getBrand(),
                carEntity.getYearOfProduction(),
                carEntity.getColor(),
                carEntity.getEngineCapacity(),
                carEntity.getPower(),
                carEntity.getMileage());
    }


}
