package com.dolittle.carApp.carMaintenance.services;
import com.dolittle.carApp.carMaintenance.entities.WorkerEntity;
import com.dolittle.carApp.carMaintenance.model.WorkerTO;
import java.util.List;


public interface WorkerService {
    List<WorkerTO> getAllWorkers();
    WorkerEntity saveWorker(WorkerTO workerTO);
    WorkerTO searchWorkerById(long id) throws Exception;
    void deleteWorker(long id);
}
