package io.github.emircakmakgil.taskservice.repository;

import io.github.emircakmakgil.taskservice.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CategoryRepository extends JpaRepository<Category, UUID> {
}
