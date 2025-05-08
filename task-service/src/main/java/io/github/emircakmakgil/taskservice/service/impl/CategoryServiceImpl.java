package io.github.emircakmakgil.taskservice.service.impl;

import io.github.emircakmakgil.taskservice.dto.category.CategoryListiningDto;
import io.github.emircakmakgil.taskservice.dto.category.CreateCategoryDto;
import io.github.emircakmakgil.taskservice.dto.category.DeleteCategoryDto;
import io.github.emircakmakgil.taskservice.dto.category.UpdateCategoryDto;
import io.github.emircakmakgil.taskservice.entity.Category;
import io.github.emircakmakgil.taskservice.service.CategoryService;

import java.util.List;
import java.util.UUID;

public class CategoryServiceImpl implements CategoryService {
    @Override
    public void add(CreateCategoryDto createCategoryDto) {

    }

    @Override
    public List<CategoryListiningDto> getAll() {
        return List.of();
    }

    @Override
    public Category update(UpdateCategoryDto updateCategoryDto) {
        return null;
    }

    @Override
    public void delete(DeleteCategoryDto deleteCategoryDto) {

    }

    @Override
    public Category findById(UUID id) {
        return null;
    }
}
