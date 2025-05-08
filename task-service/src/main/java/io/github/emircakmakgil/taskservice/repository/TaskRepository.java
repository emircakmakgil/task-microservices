package io.github.emircakmakgil.taskservice.repository;

import io.github.emircakmakgil.taskservice.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TaskRepository extends JpaRepository<Task, UUID> {
}
