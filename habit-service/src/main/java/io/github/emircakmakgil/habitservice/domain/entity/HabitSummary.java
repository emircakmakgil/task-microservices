package io.github.emircakmakgil.habitservice.domain.entity;

import io.github.emircakmakgil.habitservice.enums.PeriodType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "habit_summaries")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HabitSummary {

    @Id
    private UUID id;

    @Column(name = "habit_id", nullable = false)
    private UUID habitId;

    @Column(name = "user_id", nullable = false)
    private UUID userId;

    @Column(name = "period_start", nullable = false)
    private LocalDate periodStart;

    @Column(name = "period_end", nullable = false)
    private LocalDate periodEnd;

    @Enumerated(EnumType.STRING)
    @Column(name = "period_type", nullable = false)
    private PeriodType periodType;

    @Column(name = "total_completions", nullable = false)
    private Integer totalCompletions;

    @Column(name = "target_completions", nullable = false)
    private Integer targetCompletions;

    @Column(name = "success_rate", nullable = false, precision = 5, scale = 2)
    private Integer successRate;

    @Column(name = "last_updated", nullable = false)
    private LocalDate lastUpdated;
}
