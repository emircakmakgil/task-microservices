package io.github.emircakmakgil.taskservice.repository;

import io.github.emircakmakgil.taskservice.entity.Progress;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProgressRepository extends JpaRepository<Progress, UUID> {
}
