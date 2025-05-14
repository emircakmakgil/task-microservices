package io.github.emircakmakgil.habitservice.persistence.habitSummary;

import io.github.emircakmakgil.habitservice.domain.entity.HabitSummary;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface HabitSummaryRepository extends JpaRepository<HabitSummary, UUID> {
}
