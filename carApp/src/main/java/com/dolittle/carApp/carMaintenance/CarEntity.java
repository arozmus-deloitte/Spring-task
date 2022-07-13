package com.dolittle.carApp.carMaintenance;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CarEntity {
    @Id
    private Long id;
    private String type;

    private String brand;

    private String year;


    public CarEntity(Long id, String type, String model, String year) {
        this.id = id;
        this.type = type;
        this.brand = model;
        this.year = year;
    }


    protected CarEntity() {
    }


    public Long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public String getYear() {
        return year;
    }


}
