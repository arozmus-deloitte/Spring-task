package com.dolittle.carApp.carMaintenance.controllers;

import com.dolittle.carApp.carMaintenance.entities.CarEntity;
import com.dolittle.carApp.carMaintenance.entities.ClientEntity;
import com.dolittle.carApp.carMaintenance.model.CarTO;
import com.dolittle.carApp.carMaintenance.model.ClientTO;
import com.dolittle.carApp.carMaintenance.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/clients")
    public List<ClientTO> getAllClients(){
            return clientService.getAllClients();
        }

    @GetMapping("/client/{id}")
    public ClientTO getClientById(@PathVariable("id") long id) throws Exception {
        return clientService.searchClientById(id);
    }

    @PostMapping("/client/add")
    public ClientEntity addClient(@RequestBody ClientTO clientTO)
    {
        return clientService.saveClient(clientTO);
    }

    @DeleteMapping("/client/delete/{id}")
    public ResponseEntity<Void> deleteClientById(@PathVariable("id") long id)
    {
        clientService.deleteClient(id);
        return ResponseEntity.ok().build();
    }
}


