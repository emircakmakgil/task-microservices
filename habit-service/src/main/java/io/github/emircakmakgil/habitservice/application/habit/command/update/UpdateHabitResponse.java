package io.github.emircakmakgil.habitservice.application.habit.command.update;

import an.awesome.pipelinr.Command;
import io.github.emircakmakgil.habitservice.enums.FrequencyType;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UpdateHabitResponse  {
    private String name;
    private String description;
    private FrequencyType frequencyType;
    private Integer targetCount;
    private LocalDate updateAt;

    public UpdateHabitResponse(String description, String name, LocalDate updatedAt, FrequencyType frequencyType, Integer targetCount) {
        this.name=name;
        this.description=description;
        this.frequencyType=frequencyType;
        this.updateAt=updatedAt;
        this.targetCount=targetCount;
    }
}
