package com.dolittle.carApp.carMaintenance.controllers;

import com.dolittle.carApp.carMaintenance.entities.CarEntity;
import com.dolittle.carApp.carMaintenance.model.CarTO;
import com.dolittle.carApp.carMaintenance.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public List<CarTO> getAllCars() {
        return carService.getAllCars();
    }

    @GetMapping("/car/{id}")
    public CarTO getCar(@PathVariable("id") long id)
    {
        return new CarTO(id, "Skoda", "Octavia","2004","black","2.0","125","200000");
    }

    @PostMapping("/car/add")
    public CarEntity saveCar(@RequestBody CarTO carTO)
    {
        return carService.saveCar(carTO);
    }



}
