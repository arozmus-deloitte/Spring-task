package com.dolittle.carApp.carMaintenance.controllers;
import com.dolittle.carApp.carMaintenance.entities.CarEntity;
import com.dolittle.carApp.carMaintenance.model.CarTO;
import com.dolittle.carApp.carMaintenance.model.ClientTO;
import com.dolittle.carApp.carMaintenance.model.WorkerTO;
import com.dolittle.carApp.carMaintenance.services.CarService;
import com.dolittle.carApp.carMaintenance.services.ClientService;
import com.dolittle.carApp.carMaintenance.services.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    private CarService carService;
    @Autowired
    private ClientService clientService;
    @Autowired
    private WorkerService workerService;

    @GetMapping("/cars")
    public List<CarTO> getAllCars() {
        return carService.getAllCars();
    }

    @GetMapping("/car/{id}")
    public CarTO getCarById(@PathVariable("id") long id) throws Exception {
        return carService.searchCarById(id);
    }

    @PostMapping("/car/add")
    public CarEntity addCar(@RequestBody CarTO carTO)
    {
        return carService.saveCar(carTO);
    }

    @DeleteMapping("/car/delete/{id}")
    public ResponseEntity<Void> deleteCarById(@PathVariable("id") long id)
    {
        carService.deleteCar(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/car/{carId}/assignClient/{clientId}")
    public ResponseEntity<Void> assignClientToCar(@PathVariable("carId") long carId, @PathVariable("clientId") long clientId) throws Exception {
        CarTO carTO = carService.searchCarById(carId);
        ClientTO clientTO = clientService.searchClientById(clientId);
        carService.assignClientToCar(carTO, clientTO);

        return ResponseEntity.ok().build();
    }

    @GetMapping("/car/{type}/{brand}")
    public CarTO getCarByTypeAndBrand(@PathVariable("type") String type, @PathVariable("brand") String brand) throws Exception {
        return carService.searchCarByTypeAndBrand(type, brand);
    }

    @PutMapping("/car/{carId}/assignWorker/{workerId}")
    public ResponseEntity<Void> assignWorkerToCar(@PathVariable("carId") long carId, @PathVariable("workerId") long workerId) throws Exception {
        CarTO carTO = carService.searchCarById(carId);
        WorkerTO workerTO = workerService.searchWorkerById(workerId);
        carService.assignWorkerToCar(carTO, workerTO);
        return ResponseEntity.ok().build();
    }


}
