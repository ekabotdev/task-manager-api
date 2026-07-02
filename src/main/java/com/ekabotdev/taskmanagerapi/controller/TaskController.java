package com.ekabotdev.taskmanagerapi.controller;


import com.ekabotdev.taskmanagerapi.dto.CreateTaskRequest;
import com.ekabotdev.taskmanagerapi.dto.TaskResponse;
import com.ekabotdev.taskmanagerapi.service.TaskService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController {
    public final TaskService taskService;
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    public TaskResponse create ( @Valid @RequestBody CreateTaskRequest request) {
        return taskService.create(request);
    }
}
