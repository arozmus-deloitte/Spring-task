package com.dolittle.carApp.carMaintenance.services;

import java.util.List;

import com.dolittle.carApp.carMaintenance.entities.CarEntity;
import com.dolittle.carApp.carMaintenance.model.CarTO;
import org.springframework.http.ResponseEntity;

public interface CarService {

    List<CarTO> getAllCars();

    CarEntity saveCar(CarTO carTO);

    CarTO searchCarById(long id) throws Exception;

    void deleteCar(long id);
}
