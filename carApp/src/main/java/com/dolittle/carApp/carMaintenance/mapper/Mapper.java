package com.dolittle.carApp.carMaintenance.mapper;

import com.dolittle.carApp.carMaintenance.entities.CarEntity;
import com.dolittle.carApp.carMaintenance.entities.ClientEntity;
import com.dolittle.carApp.carMaintenance.entities.WorkerEntity;
import com.dolittle.carApp.carMaintenance.model.CarTO;
import com.dolittle.carApp.carMaintenance.model.ClientTO;
import com.dolittle.carApp.carMaintenance.model.WorkerTO;

public class Mapper {
    public static CarEntity mapToCarEntity(CarTO carTO) {

        return new CarEntity(
                carTO.getId(),
                carTO.getType(),
                carTO.getBrand(),
                carTO.getYearOfProduction(),
                carTO.getColor(),
                carTO.getEngineCapacity(),
                carTO.getPower(),
                carTO.getMileage(),
                carTO.getClientEntity(),
                carTO.getWorkerEntity());
    }

    public static CarTO mapToCarTO(CarEntity carEntity) {

        return new CarTO(
                carEntity.getId(),
                carEntity.getType(),
                carEntity.getBrand(),
                carEntity.getYearOfProduction(),
                carEntity.getColor(),
                carEntity.getEngineCapacity(),
                carEntity.getPower(),
                carEntity.getMileage(),
                carEntity.getClientEntity(),
                carEntity.getWorkerEntity());
    }

    public static ClientTO mapToClientTO(ClientEntity clientEntity) {
        return new ClientTO(clientEntity.getId(), clientEntity.getName(), clientEntity.getLastName(), clientEntity.getResidence(), clientEntity.getDateOfBirth(), clientEntity.getPhoneNumber(), clientEntity.getCardNumber());
    }

    public static ClientEntity mapToClientEntity(ClientTO clientTO) {
        return new ClientEntity(
                clientTO.getId(),
                clientTO.getName(),
                clientTO.getLastName(),
                clientTO.getResidence(),
                clientTO.getDateOfBirth(),
                clientTO.getPhoneNumber(),
                clientTO.getCardNumber());
    }

    public static WorkerTO mapToWorkerTO(WorkerEntity workerEntity) {
        return new WorkerTO(
                workerEntity.getId(),
                workerEntity.getName(),
                workerEntity.getLastName(),
                workerEntity.getResidence(),
                workerEntity.getDateOfBirth(),
                workerEntity.getFunction());
    }

    public static WorkerEntity mapToWorkerEntity(WorkerTO workerTO) {
        return new WorkerEntity(
                workerTO.getId(),
                workerTO.getName(),
                workerTO.getLastName(),
                workerTO.getResidence(),
                workerTO.getDateOfBirth(),
                workerTO.getFunction());
    }


}
