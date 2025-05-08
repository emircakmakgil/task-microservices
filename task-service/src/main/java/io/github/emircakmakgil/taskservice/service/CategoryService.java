package io.github.emircakmakgil.taskservice.service;

import io.github.emircakmakgil.taskservice.dto.category.CategoryListiningDto;
import io.github.emircakmakgil.taskservice.dto.category.CreateCategoryDto;
import io.github.emircakmakgil.taskservice.dto.category.DeleteCategoryDto;
import io.github.emircakmakgil.taskservice.dto.category.UpdateCategoryDto;
import io.github.emircakmakgil.taskservice.entity.Category;

import java.util.List;
import java.util.UUID;

public interface CategoryService {
    void add(CreateCategoryDto createCategoryDto);
    List<CategoryListiningDto> getAll();
    Category update(UpdateCategoryDto updateCategoryDto);
    void delete(DeleteCategoryDto deleteCategoryDto);
    Category findById(UUID id);
}
