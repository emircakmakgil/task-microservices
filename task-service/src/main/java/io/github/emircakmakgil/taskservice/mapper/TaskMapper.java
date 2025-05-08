package io.github.emircakmakgil.taskservice.mapper;

import io.github.emircakmakgil.taskservice.dto.task.CreateTaskDto;
import io.github.emircakmakgil.taskservice.dto.task.TaskListiningDto;
import io.github.emircakmakgil.taskservice.dto.task.UpdateTaskDto;
import io.github.emircakmakgil.taskservice.entity.Task;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Data
public class TaskMapper {
    public Task createTaskFromCreateTaskDto(CreateTaskDto createTaskDto){
        return Task
                .builder()
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .description(createTaskDto.getDescription())
                .actualDuration(createTaskDto.getActualDuration())
                .dueDate(createTaskDto.getDueDate())
                .title(createTaskDto.getTitle())
                .startDate(createTaskDto.getStartDate())
                .endDate(createTaskDto.getEndDate())
                .priority(createTaskDto.getPriority())
                .status(createTaskDto.getStatus())
                .build();
    }
    public Task updateTaskFromUpdateTaskDto(UpdateTaskDto updateTaskDto,Task task){
        return Task
                .builder()
                .updatedAt(LocalDateTime.now())
                .status(updateTaskDto.getStatus())
                .title(updateTaskDto.getTitle())
                .description(updateTaskDto.getDescription())
                .priority(updateTaskDto.getPriority())
                .endDate(updateTaskDto.getEndDate())
                .dueDate(updateTaskDto.getDueDate())
                .estimatedDuration(updateTaskDto.getEstimatedDuration())
                .actualDuration(updateTaskDto.getActualDuration())
                .build();

    }
    public TaskListiningDto toTaskListiningDto(Task task){
        return new TaskListiningDto(
                task.getActualDuration(),
                task.getEstimatedDuration(),
                task.getDueDate(),
                task.getDescription(),
                task.getEndDate(),
                task.getStartDate(),
                task.getPriority(),
                task.getTitle(),
                task.getStatus()
        );
    }
}
