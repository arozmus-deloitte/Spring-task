package com.dolittle.carApp.carMaintenance.services;
import com.dolittle.carApp.carMaintenance.DAO.ClientDAO;
import com.dolittle.carApp.carMaintenance.entities.ClientEntity;
import com.dolittle.carApp.carMaintenance.mapper.Mapper;
import com.dolittle.carApp.carMaintenance.model.ClientTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import static com.dolittle.carApp.carMaintenance.mapper.Mapper.*;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientDAO clientDAO;

    @Override
    public List<ClientTO> getAllClients(){
        return clientDAO.findAll()
                .stream()
                .map(Mapper::mapToClientTO)
                .collect(Collectors.toList());
        }

    @Override
    public ClientEntity saveClient(ClientTO clientTO) {
        return clientDAO.save(mapToClientEntity(clientTO));
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
