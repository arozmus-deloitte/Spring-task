package com.dolittle.carApp.carMaintenance.DAO;
import com.dolittle.carApp.carMaintenance.entities.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface  CarDAO extends JpaRepository<CarEntity, Long> {
    @Query("SELECT c from CarEntity c WHERE c.type = ?1 AND c.brand = ?2")
    Optional<CarEntity> searchCarByTypeAndBrand(String type, String brand);
}
