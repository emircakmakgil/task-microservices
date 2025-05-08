package io.github.emircakmakgil.taskservice.dto.task;

import io.github.emircakmakgil.taskservice.enums.Priority;
import io.github.emircakmakgil.taskservice.enums.Status;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class TaskListiningDto {
    private String title;
    private String description;
    private LocalDateTime dueDate;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Integer estimatedDuration;
    private Integer actualDuration;
    private Priority priority;
    private Status status;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;
    private UUID categoryId;

    public TaskListiningDto(Integer actualDuration, Integer estimatedDuration, LocalDateTime dueDate, String description, LocalDateTime endDate, LocalDateTime startDate, Priority priority,  String title, Status status) {
        this.title=title;
        this.actualDuration=actualDuration;
        this.estimatedDuration=estimatedDuration;
        this.dueDate=dueDate;
        this.description=description;
        this.endDate=endDate;
        this.startDate=startDate;
        this.priority=priority;
        this.status=status;
    }
}
