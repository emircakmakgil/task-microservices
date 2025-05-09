package io.github.emircakmakgil.taskservice.mapper;

import io.github.emircakmakgil.taskservice.dto.category.CategoryListiningDto;
import io.github.emircakmakgil.taskservice.dto.category.CreateCategoryDto;
import io.github.emircakmakgil.taskservice.dto.category.UpdateCategoryDto;
import io.github.emircakmakgil.taskservice.entity.Category;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Data
public class CategoryMapper {
    public Category createCategoryFromCreatedCategoryDto(CreateCategoryDto createCategoryDto){
        return Category
                .builder()
                .createdAt(LocalDate.now())
                .updatedAt(LocalDate.now())
                .name(createCategoryDto.getName())
                .description(createCategoryDto.getDescription())
                .build();
    }
    public Category updateCategoryFromUpdatedCategoryDto(UpdateCategoryDto updateCategoryDto,Category category){
        return Category
                .builder()
                .description(updateCategoryDto.getDescription())
                .name(updateCategoryDto.getName())
                .updatedAt(updateCategoryDto.getUpdatedAt())
                .build();
    }
    public CategoryListiningDto toCategoryListiningDto(Category category){
        return new CategoryListiningDto(
                category.getName(),
                category.getUpdatedAt(),
                category.getDescription(),
                category.getCreatedAt()
        );
    }
}
