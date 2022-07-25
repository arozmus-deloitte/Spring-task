package com.dolittle.carApp.carMaintenance.services;

import java.util.List;

import com.dolittle.carApp.carMaintenance.entities.CarEntity;
import com.dolittle.carApp.carMaintenance.entities.ClientEntity;
import com.dolittle.carApp.carMaintenance.model.CarTO;
import com.dolittle.carApp.carMaintenance.model.ClientTO;

public interface CarService {

    List<CarTO> getAllCars();
    CarEntity saveCar(CarTO carTO);
    CarTO searchCarById(long id) throws Exception;
    void deleteCar(long id);
    void assignClientToCar(CarTO carTO, long clientId);
}
