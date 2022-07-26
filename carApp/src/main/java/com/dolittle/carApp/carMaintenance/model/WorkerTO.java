package com.dolittle.carApp.carMaintenance.model;

import com.dolittle.carApp.carMaintenance.enums.Worker;

public class WorkerTO {
    long id;
    private String name;
    private String lastName;
    private String residence;
    private String dateOfBirth;
    private Worker function;

    public WorkerTO(long id, String name, String lastName, String residence, String dateOfBirth, Worker function) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.residence = residence;
        this.dateOfBirth = dateOfBirth;
        this.function = function;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getResidence() {
        return residence;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public Worker getFunction() {
        return function;
    }
}
