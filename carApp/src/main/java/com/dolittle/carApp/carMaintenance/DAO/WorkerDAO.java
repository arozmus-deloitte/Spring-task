package com.dolittle.carApp.carMaintenance.DAO;
import com.dolittle.carApp.carMaintenance.entities.WorkerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerDAO extends JpaRepository<WorkerEntity, Long> {
}
