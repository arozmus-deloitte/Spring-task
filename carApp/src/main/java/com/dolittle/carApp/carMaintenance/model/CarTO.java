package com.dolittle.carApp.carMaintenance.model;

import com.dolittle.carApp.carMaintenance.entities.ClientEntity;
import com.dolittle.carApp.carMaintenance.entities.WorkerEntity;

public class CarTO {
    private long id;
    private String type;
    private String brand;
    private String yearOfProduction;
    private String color;
    private String engineCapacity;
    private String power;
    private String mileage;
    private ClientEntity clientEntity;
    private WorkerEntity workerEntity;

    public CarTO(long id, String type, String brand, String yearOfProduction, String color, String engineCapacity, String power, String mileage, ClientEntity clientEntity, WorkerEntity workerEntity) {
        this.id = id;
        this.type = type;
        this.brand = brand;
        this.yearOfProduction = yearOfProduction;
        this.color = color;
        this.engineCapacity = engineCapacity;
        this.power = power;
        this.mileage = mileage;
        this.clientEntity = clientEntity;
        this.workerEntity = workerEntity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public ClientEntity getClientEntity() {
        return clientEntity;
    }

    public void setClientEntity(ClientEntity clientEntity) {
        this.clientEntity = clientEntity;
    }

    public WorkerEntity getWorkerEntity() {
        return workerEntity;
    }

    public void setWorkerEntity(WorkerEntity workerEntity) {
        this.workerEntity = workerEntity;
    }
}
