package com.dolittle.carApp.carMaintenance.services;

import com.dolittle.carApp.carMaintenance.DAO.ClientDAO;
import com.dolittle.carApp.carMaintenance.entities.ClientEntity;
import com.dolittle.carApp.carMaintenance.model.ClientTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientDAO clientDAO;

    public List<ClientTO> getAllClients(){
        return clientDAO.findAll()
                .stream()
                .map(this::mapToClientTO)
                .collect(Collectors.toList());
        }

    private ClientTO mapToClientTO(ClientEntity clientEntity)
    {
        return new ClientTO(clientEntity.getId(), clientEntity.getName(), clientEntity.getLastName(), clientEntity.getResidence(), clientEntity.getDateOfBirth(), clientEntity.getPhoneNumber(), clientEntity.getCardNumber());
    }

    @Override
    public ClientEntity saveClient(ClientTO clientTO) {
        return clientDAO.save(mapToClientEntity(clientTO));
    }

    private ClientEntity mapToClientEntity(ClientTO clientTO) {
        return new ClientEntity(
                clientTO.getId(),
                clientTO.getName(),
                clientTO.getLastName(),
                clientTO.getResidence(),
                clientTO.getDateOfBirth(),
                clientTO.getPhoneNumber(),
                clientTO.getCardNumber());
    }

    @Override
    public ClientTO searchClientById(long id) throws Exception {
        Optional<ClientEntity> findClientTO = clientDAO.findById(id);
        if(findClientTO.isPresent())
        {
            return mapToClientTO(findClientTO.get());
        }
        else {
            throw new Exception("Client not found");
        }
    }

    @Override
    public void deleteClient(long id)
    {
        clientDAO.deleteById(id);
    }

}
