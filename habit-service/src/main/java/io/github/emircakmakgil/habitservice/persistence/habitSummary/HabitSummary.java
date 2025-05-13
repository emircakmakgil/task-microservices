package io.github.emircakmakgil.habitservice.persistence.habitSummary;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface HabitSummary extends JpaRepository<HabitSummary, UUID> {
}
