package io.github.emircakmakgil.taskservice.controller;

import io.github.emircakmakgil.taskservice.dto.task.CreateTaskDto;
import io.github.emircakmakgil.taskservice.dto.task.DeleteTaskDto;
import io.github.emircakmakgil.taskservice.dto.task.TaskListiningDto;
import io.github.emircakmakgil.taskservice.dto.task.UpdateTaskDto;
import io.github.emircakmakgil.taskservice.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/task")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    @PostMapping
    public void createTask(@RequestBody CreateTaskDto createTaskDto){
        this.taskService.add(createTaskDto);
    }
    @PutMapping
    public void updateTask(@RequestBody UpdateTaskDto updateTaskDto){
        this.taskService.update(updateTaskDto);
    }
    @DeleteMapping
    public void deleteTask(@RequestBody DeleteTaskDto deleteTaskDto){
        this.taskService.delete(deleteTaskDto);
    }
    @GetMapping
    public List<TaskListiningDto> getAllTask(){
        return this.taskService.getAll();
    }
}
