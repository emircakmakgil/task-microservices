package io.github.emircakmakgil.taskservice.service.impl;

import io.github.emircakmakgil.taskservice.dto.task.CreateTaskDto;
import io.github.emircakmakgil.taskservice.dto.task.DeleteTaskDto;
import io.github.emircakmakgil.taskservice.dto.task.TaskListiningDto;
import io.github.emircakmakgil.taskservice.dto.task.UpdateTaskDto;
import io.github.emircakmakgil.taskservice.entity.Task;
import io.github.emircakmakgil.taskservice.mapper.TaskMapper;
import io.github.emircakmakgil.taskservice.repository.TaskRepository;
import io.github.emircakmakgil.taskservice.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;
    private final TaskMapper taskMapper;

    public TaskServiceImpl(TaskRepository taskRepository, TaskMapper taskMapper) {
        this.taskRepository = taskRepository;
        this.taskMapper = taskMapper;
    }

    @Override
    public void add(CreateTaskDto createTaskDto) {
        Task task=taskMapper.createTaskFromCreateTaskDto(createTaskDto);
        taskRepository.save(task);

    }

    @Override
    public List<TaskListiningDto> getAll() {
        List<Task> tasks=taskRepository.findAll();
        List<TaskListiningDto> taskListiningDtos=tasks
                .stream()
                .map(taskMapper::toTaskListiningDto)
                .collect(Collectors.toList());
        return taskListiningDtos;
    }

    @Override
    public Task update(UpdateTaskDto updateTaskDto) {
        Task task=taskRepository.findById(updateTaskDto.getId()).orElseThrow(()-> new RuntimeException("Task Not Found!"));
        taskMapper.updateTaskFromUpdateTaskDto(updateTaskDto,task);
        return taskRepository.save(task);
    }

    @Override
    public void delete(DeleteTaskDto deleteTaskDto) {
        Task task=taskRepository.findById(deleteTaskDto.getId()).orElseThrow(()-> new RuntimeException("Task Not Found!"));
        taskRepository.delete(task);
    }

    @Override
    public Task findById(UUID id) {
        Task task=taskRepository.findById(id).orElseThrow(()-> new RuntimeException("Task Not Found!"));
        return task;
    }
}
