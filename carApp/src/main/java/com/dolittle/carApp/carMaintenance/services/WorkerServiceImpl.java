package com.dolittle.carApp.carMaintenance.services;
import com.dolittle.carApp.carMaintenance.DAO.WorkerDAO;
import com.dolittle.carApp.carMaintenance.entities.WorkerEntity;
import com.dolittle.carApp.carMaintenance.model.WorkerTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class WorkerServiceImpl implements WorkerService {

    @Autowired
    WorkerDAO workerDAO;

    @Override
    public List<WorkerTO> getAllWorkers() {
        return workerDAO.findAll()
                .stream()
                .map(this::mapToWorkerTO)
                .collect(Collectors.toList());
    }

    @Override
    public WorkerEntity saveWorker(WorkerTO workerTO) {
        return workerDAO.save(mapToWorkerEntity(workerTO));
    }

    @Override
    public WorkerTO searchWorkerById(long id) throws Exception {
        Optional<WorkerEntity> findWorkerTO = workerDAO.findById(id);
        if(findWorkerTO.isPresent())
        {
            return mapToWorkerTO(findWorkerTO.get());
        }
        else {
            throw new Exception("Client not found");
        }
    }

    @Override
    public void deleteWorker(long id) {
        workerDAO.deleteById(id);
    }

    private WorkerTO mapToWorkerTO(WorkerEntity workerEntity) {
        return new WorkerTO(
                workerEntity.getId(),
                workerEntity.getName(),
                workerEntity.getLastName(),
                workerEntity.getResidence(),
                workerEntity.getDateOfBirth(),
                workerEntity.getFunction());
    }

    private WorkerEntity mapToWorkerEntity(WorkerTO workerTO) {
        return new WorkerEntity(
                workerTO.getId(),
                workerTO.getName(),
                workerTO.getLastName(),
                workerTO.getResidence(),
                workerTO.getDateOfBirth(),
                workerTO.getFunction());
    }
}

