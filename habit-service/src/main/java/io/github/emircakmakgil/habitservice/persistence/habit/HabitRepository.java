package io.github.emircakmakgil.habitservice.persistence.habit;

import io.github.emircakmakgil.habitservice.domain.entity.Habit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface HabitRepository extends JpaRepository<Habit,UUID> {
}
