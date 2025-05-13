package io.github.emircakmakgil.habitservice.application.habit.command.create;

import io.github.emircakmakgil.habitservice.enums.FrequencyType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateHabitResponse {
    private String name;
    private String description;
    private FrequencyType frequencyType;
    private Integer targetCount;
}
