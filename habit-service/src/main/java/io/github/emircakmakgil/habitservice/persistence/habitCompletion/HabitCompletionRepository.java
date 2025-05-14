package io.github.emircakmakgil.habitservice.persistence.habitCompletion;

import io.github.emircakmakgil.habitservice.domain.entity.HabitCompletion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface HabitCompletionRepository extends JpaRepository<HabitCompletion, UUID> {
}
