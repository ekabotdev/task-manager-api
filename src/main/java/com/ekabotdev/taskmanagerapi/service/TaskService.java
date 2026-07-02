package com.ekabotdev.taskmanagerapi.service;

import com.ekabotdev.taskmanagerapi.dto.CreateTaskRequest;
import com.ekabotdev.taskmanagerapi.dto.TaskResponse;
import com.ekabotdev.taskmanagerapi.entity.Task;
import com.ekabotdev.taskmanagerapi.repository.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    private final TaskRepository taskRepository;
    public TaskService (TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    public TaskResponse create(CreateTaskRequest request) {
        Task task = new Task();
        task.setTitle(request.getTitle());
        task.setDescription(request.getDescription());

        Task savedTask = taskRepository.save(task);
        TaskResponse taskResponse = new TaskResponse();
        savedTask.setTitle(task.getTitle());
        savedTask.setDescription(task.getDescription());
        return taskResponse;
    }
}
