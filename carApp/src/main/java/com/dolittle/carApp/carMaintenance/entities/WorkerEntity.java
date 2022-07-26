package com.dolittle.carApp.carMaintenance.entities;
import com.dolittle.carApp.carMaintenance.enums.Worker;

import javax.persistence.*;

@Entity
@Table(name = "worker")
public class WorkerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    private String name;
    private String lastName;
    private String residence;
    private String dateOfBirth;
    @Enumerated(EnumType.ORDINAL)
    private Worker function;

    public WorkerEntity(long id, String name, String lastName, String residence, String dateOfBirth, Worker function) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.residence = residence;
        this.dateOfBirth = dateOfBirth;
        this.function = function;
    }

    public WorkerEntity() {

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
