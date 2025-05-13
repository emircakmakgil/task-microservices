package io.github.emircakmakgil.habitservice.persistence.habitCompletion;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface HabitCompletion extends JpaRepository<HabitCompletion, UUID> {
}
