package io.github.emircakmakgil.taskservice.service.impl;

import io.github.emircakmakgil.taskservice.dto.category.CategoryListiningDto;
import io.github.emircakmakgil.taskservice.dto.category.CreateCategoryDto;
import io.github.emircakmakgil.taskservice.dto.category.DeleteCategoryDto;
import io.github.emircakmakgil.taskservice.dto.category.UpdateCategoryDto;
import io.github.emircakmakgil.taskservice.entity.Category;
import io.github.emircakmakgil.taskservice.mapper.CategoryMapper;
import io.github.emircakmakgil.taskservice.repository.CategoryRepository;
import io.github.emircakmakgil.taskservice.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    public CategoryServiceImpl(CategoryRepository categoryRepository, CategoryMapper categoryMapper) {
        this.categoryRepository = categoryRepository;
        this.categoryMapper = categoryMapper;
    }

    @Override
    public void add(CreateCategoryDto createCategoryDto) {
        Category category= categoryMapper.createCategoryFromCreatedCategoryDto(createCategoryDto);
        categoryRepository.save(category);
    }

    @Override
    public List<CategoryListiningDto> getAll() {
        List<Category> categories=categoryRepository.findAll();
        List<CategoryListiningDto> categoryListiningDtos=categories.stream().map(categoryMapper::toCategoryListiningDto).collect(Collectors.
        toList());
        return categoryListiningDtos;
    }

    @Override
    public Category update(UpdateCategoryDto updateCategoryDto) {
        Category category=categoryRepository.findById(updateCategoryDto.getId()).orElseThrow(()-> new RuntimeException("Category Not Found!"));
        categoryMapper.updateCategoryFromUpdatedCategoryDto(updateCategoryDto,category);
        return categoryRepository.save(category);
    }

    @Override
    public void delete(DeleteCategoryDto deleteCategoryDto) {
        Category category=categoryRepository.findById(deleteCategoryDto.getId()).orElseThrow(()-> new RuntimeException("Category Not Found!"));
        categoryRepository.delete(category);

    }

    @Override
    public Category findById(UUID id) {
        Category category=categoryRepository.findById(id).orElseThrow(()-> new RuntimeException("Category Not Found!"));
        return category;
    }
}
