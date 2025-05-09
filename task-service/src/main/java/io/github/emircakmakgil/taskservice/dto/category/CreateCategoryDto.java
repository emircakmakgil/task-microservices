package io.github.emircakmakgil.taskservice.dto.category;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class CreateCategoryDto {
    private String name;
    private String description;
    private LocalDate createdAt;
    private LocalDate updatedAt;


}
