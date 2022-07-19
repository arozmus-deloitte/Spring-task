package com.dolittle.carApp.carMaintenance.DAO;
import com.dolittle.carApp.carMaintenance.entities.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  CarDAO extends JpaRepository<CarEntity, Long> {
}
