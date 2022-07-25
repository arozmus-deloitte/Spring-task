package com.dolittle.carApp.carMaintenance.entities;

import com.dolittle.carApp.carMaintenance.model.ClientTO;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class CarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String type;
    private String brand;
    private String yearOfProduction;
    private String color;
    private String engineCapacity;
    private String power;
    private String mileage;
    private long clientId;

    public CarEntity(long id, String type, String brand, String yearOfProduction, String color, String engineCapacity, String power, String mileage, long clientId) {
        this.id = id;
        this.type = type;
        this.brand = brand;
        this.yearOfProduction = yearOfProduction;
        this.color = color;
        this.engineCapacity = engineCapacity;
        this.power = power;
        this.mileage = mileage;
        this.clientId = clientId;
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

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }
}
