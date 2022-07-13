package com.dolittle.carApp.carMaintenance.model;

public class ClientTO {
    private long id;
    private String name;
    private String lastName;
    private String residence;
    private String dateOfBirth;
    private String phoneNumber;
    private String cardNumber;

    public ClientTO(long id, String name, String lastName, String residence, String dateOfBirth, String phoneNumber, String cardNumber) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.residence = residence;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.cardNumber = cardNumber;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }
}
