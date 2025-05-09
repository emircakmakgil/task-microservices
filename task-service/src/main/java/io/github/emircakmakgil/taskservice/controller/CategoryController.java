package io.github.emircakmakgil.taskservice.controller;

import io.github.emircakmakgil.taskservice.dto.category.CategoryListiningDto;
import io.github.emircakmakgil.taskservice.dto.category.CreateCategoryDto;
import io.github.emircakmakgil.taskservice.dto.category.DeleteCategoryDto;
import io.github.emircakmakgil.taskservice.dto.category.UpdateCategoryDto;
import io.github.emircakmakgil.taskservice.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/category")
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
    @PostMapping
    public void createCategory(CreateCategoryDto createCategoryDto){
        categoryService.add(createCategoryDto);
    }
    @PutMapping
    public void updateCategory(UpdateCategoryDto updateCategoryDto){
        categoryService.update(updateCategoryDto);
    }
    @DeleteMapping
    public void deleteCategory(DeleteCategoryDto deleteCategoryDto){
        categoryService.delete(deleteCategoryDto);
    }
    @GetMapping
    public List<CategoryListiningDto> getAll(){
        return this.categoryService.getAll();
    }
}
