package com.dolittle.carApp.carMaintenance.services;

import com.dolittle.carApp.carMaintenance.model.ClientTO;

import java.util.List;

public interface ClientService {
    List<ClientTO> getAllClients();
}
