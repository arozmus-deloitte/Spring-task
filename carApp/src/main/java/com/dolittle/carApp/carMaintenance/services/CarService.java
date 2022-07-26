package com.dolittle.carApp.carMaintenance.services;
import java.util.List;
import com.dolittle.carApp.carMaintenance.entities.CarEntity;
import com.dolittle.carApp.carMaintenance.entities.ClientEntity;
import com.dolittle.carApp.carMaintenance.model.CarTO;
import com.dolittle.carApp.carMaintenance.model.ClientTO;
import com.dolittle.carApp.carMaintenance.model.WorkerTO;

public interface CarService {

    List<CarTO> getAllCars();
    CarEntity saveCar(CarTO carTO);
    CarTO searchCarById(long id) throws Exception;
    void deleteCar(long id);
    void assignClientToCar(CarTO carTO, ClientTO clientTO);
    CarTO searchCarByTypeAndBrand(String type, String brand) throws Exception;
    void assignWorkerToCar(CarTO carTO, WorkerTO workerTO);
}
