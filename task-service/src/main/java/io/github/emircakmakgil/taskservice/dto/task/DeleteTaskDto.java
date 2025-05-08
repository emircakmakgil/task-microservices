package io.github.emircakmakgil.taskservice.dto.task;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class DeleteTaskDto {
    private UUID id;
}
