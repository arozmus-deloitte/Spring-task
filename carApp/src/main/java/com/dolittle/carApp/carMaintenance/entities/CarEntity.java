package com.dolittle.carApp.carMaintenance.entities;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class CarEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "type")
    private String type;
    @Column(name = "brand")
    private String brand;
    @Column(name = "year_of_production")
    private String yearOfProduction;
    @Column(name = "color")
    private String color;
    @Column(name = "engine_capacity")
    private String engineCapacity;
    @Column(name = "power")
    private String power;
    @Column(name = "mileage")
    private String mileage;

    public CarEntity(long id, String type, String brand, String yearOfProduction, String color, String engineCapacity, String power, String mileage) {
        this.id = id;
        this.type = type;
        this.brand = brand;
        this.yearOfProduction = yearOfProduction;
        this.color = color;
        this.engineCapacity = engineCapacity;
        this.power = power;
        this.mileage = mileage;
    }

    public CarEntity() {
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

    public String getYearOfProduction() {
        return yearOfProduction;
    }

    public String getColor() {
        return color;
    }

    public String getEngineCapacity() {
        return engineCapacity;
    }

    public String getPower() {
        return power;
    }

    public String getMileage() {
        return mileage;
    }
}
