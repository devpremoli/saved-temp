package com.example.TaskManagementSystem.service;

import com.example.TaskManagementSystem.exception.ResourceNotFoundException;
import com.example.TaskManagementSystem.model.Task;
import com.example.TaskManagementSystem.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    public Task getTaskById(Long id) {
        return taskRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(id + " not found"));
    }

    public Task updateTask(Long id, Task task) {
        return Optional.ofNullable(getTaskById(id))
                .map(
                        oldTask -> {
                            oldTask.setTitle(task.getTitle());
                            oldTask.setDescription(task.getDescription());
                            oldTask.setStatus(task.isStatus());
                            return taskRepository.save(oldTask);
                        }
                )
                .orElseThrow(() -> new ResourceNotFoundException("Task with id " + id + " not found"));
    }
}
