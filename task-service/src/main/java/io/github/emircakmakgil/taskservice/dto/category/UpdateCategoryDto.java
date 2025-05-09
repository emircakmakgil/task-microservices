package io.github.emircakmakgil.taskservice.dto.category;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
public class UpdateCategoryDto {
    private UUID id;
    private String name;
    private String description;
    private LocalDate updatedAt;
}
