package com.dolittle.carApp.carMaintenance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientDAO extends JpaRepository<ClientEntity, Long> {
}
