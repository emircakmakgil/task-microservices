package io.github.emircakmakgil.habitservice.application.habit.query.getlist;

import io.github.emircakmakgil.habitservice.enums.FrequencyType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetListHabitItemDto {
    private String name;
    private String description;
    private FrequencyType frequencyType;
    private Integer targetCount;
    private LocalDate createdAt;
    private LocalDate updateAt;

    public GetListHabitItemDto(String name, String description, FrequencyType frequencyType, Integer targetCount) {
        this.name=name;
        this.description=description;
        this.frequencyType=frequencyType;
        this.targetCount=targetCount;

    }
}
