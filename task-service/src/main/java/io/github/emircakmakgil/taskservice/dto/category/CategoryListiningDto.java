package io.github.emircakmakgil.taskservice.dto.category;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class CategoryListiningDto {
    private String name;
    private String description;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    public CategoryListiningDto(String name, LocalDate updatedAt, String description, LocalDate createdAt) {
        this.name=name;
        this.createdAt=createdAt;
        this.updatedAt=updatedAt;
        this.description=description;
    }
}
