package com.dolittle.carApp.carMaintenance;

import com.dolittle.carApp.carMaintenance.model.CarTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class CarController {

    @Autowired
    private CarService carService;


    @GetMapping("/cars")
    public List<CarTO> getAllCars() {return carService.getAllCars();}
}
