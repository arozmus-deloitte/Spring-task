package com.dolittle.carApp.carMaintenance.DAO;
import com.dolittle.carApp.carMaintenance.entities.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientDAO extends JpaRepository<ClientEntity, Long> {
}
