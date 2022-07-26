package com.dolittle.carApp.carMaintenance.controllers;
import com.dolittle.carApp.carMaintenance.entities.WorkerEntity;
import com.dolittle.carApp.carMaintenance.model.WorkerTO;
import com.dolittle.carApp.carMaintenance.services.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class WorkerController{
    @Autowired
    private WorkerService workerService;

    @GetMapping("/workers")
    public List<WorkerTO> getAllWorkers() {
        return workerService.getAllWorkers();
    }

    @GetMapping("/worker/{id}")
    public WorkerTO getWorkerById(@PathVariable("id") long id) throws Exception {
        return workerService.searchWorkerById(id);
    }

    @PostMapping("/worker/add")
    public WorkerEntity addWorker(@RequestBody WorkerTO workerTO) {
        return workerService.saveWorker(workerTO);
    }

    @DeleteMapping("/worker/delete/{id}")
    public ResponseEntity<Void> deleteWorkerById(@PathVariable("id") long id) {
        workerService.deleteWorker(id);
        return ResponseEntity.ok().build();
    }
}
