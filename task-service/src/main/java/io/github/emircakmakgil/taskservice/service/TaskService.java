package io.github.emircakmakgil.taskservice.service;

import io.github.emircakmakgil.taskservice.dto.task.CreateTaskDto;
import io.github.emircakmakgil.taskservice.dto.task.DeleteTaskDto;
import io.github.emircakmakgil.taskservice.dto.task.TaskListiningDto;
import io.github.emircakmakgil.taskservice.dto.task.UpdateTaskDto;
import io.github.emircakmakgil.taskservice.entity.Task;

import java.util.List;
import java.util.UUID;

public interface TaskService {
    void add(CreateTaskDto createTaskDto);
    List<TaskListiningDto> getAll();
    Task update(UpdateTaskDto updateTaskDto);
    void delete(DeleteTaskDto deleteTaskDto);
    Task findById(UUID id);
}
