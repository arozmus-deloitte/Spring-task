package com.dolittle.carApp.carMaintenance.controlles;

import com.dolittle.carApp.carMaintenance.model.ClientTO;
import com.dolittle.carApp.carMaintenance.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/clients")
    public List<ClientTO> getAllClients(){
            return clientService.getAllClients();
        }
}


