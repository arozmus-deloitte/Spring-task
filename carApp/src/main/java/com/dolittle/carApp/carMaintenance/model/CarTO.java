package com.dolittle.carApp.carMaintenance.model;

public class CarTO {

    private long id;
    private String type;
    private String brand;
    private String year;


    public CarTO(long id, String type, String model, String year) {
        this.id = id;
        this.type = type;
        this.brand = type;
        this.year = year;

    }

    public long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public String getYear() {
        return brand;
    }

}
