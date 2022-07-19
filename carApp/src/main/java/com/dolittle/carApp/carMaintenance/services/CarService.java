package com.dolittle.carApp.carMaintenance.services;

import java.util.List;

import com.dolittle.carApp.carMaintenance.entities.CarEntity;
import com.dolittle.carApp.carMaintenance.model.CarTO;

public interface CarService {

    List<CarTO> getAllCars();

    CarEntity saveCar(CarTO carTO);
}
