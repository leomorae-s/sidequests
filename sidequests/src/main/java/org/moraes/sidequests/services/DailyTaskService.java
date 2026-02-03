package org.moraes.sidequests.services;


import org.moraes.sidequests.domain.tasks.DailyTask;
import org.moraes.sidequests.repositorys.DailyTaskRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class DailyTaskService {

    private final DailyTaskRepository repository;

    public DailyTaskService(DailyTaskRepository repository) {
        this.repository = repository;
    }

    public ResponseEntity<DailyTask> create(DailyTask task) {
        if (task.getName().isEmpty()) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(task);
        }

        repository.save(task);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(task);
    }

}
