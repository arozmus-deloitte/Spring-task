package com.dolittle.carApp.carMaintenance.services;

import com.dolittle.carApp.carMaintenance.entities.ClientEntity;
import com.dolittle.carApp.carMaintenance.model.ClientTO;

import java.util.List;

public interface ClientService {
    List<ClientTO> getAllClients();
    ClientEntity saveClient(ClientTO clientTO);
    ClientTO searchClientById(long id) throws Exception;
    void deleteClient(long id);
}
