package org.moraes.sidequests.controllers;

import org.moraes.sidequests.DTOs.DailyTaskDTO;
import org.moraes.sidequests.domain.tasks.DailyTask;
import org.moraes.sidequests.services.DailyTaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DailyTaskController {

    private final DailyTaskService dailyTaskService;

    private DailyTaskController(DailyTaskService dailyTaskService) {
        this.dailyTaskService = dailyTaskService;
    }

    @PostMapping("/create/dailyTask")
    public ResponseEntity createDailyTask(@RequestBody DailyTaskDTO data) {

        if (data.name().isEmpty()) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("Erro, nome é obrigatorio");
        }

        DailyTask task = new DailyTask(data.name(), data.description());

        return dailyTaskService.create(task);

    }
}
