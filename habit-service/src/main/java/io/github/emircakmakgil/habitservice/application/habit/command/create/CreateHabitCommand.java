package io.github.emircakmakgil.habitservice.application.habit.command.create;

import an.awesome.pipelinr.Command;
import io.github.emircakmakgil.habitservice.enums.FrequencyType;
import io.github.emircakmakgil.habitservice.persistence.habit.HabitRepository;
import lombok.*;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateHabitCommand implements Command<CreateHabitResponse> {
    private String name;
    private String description;
    private FrequencyType frequencyType;
    private Integer targetCount;
    private LocalDate createdAt;
    private LocalDate updateAt;


    @Component
    @RequiredArgsConstructor
    public static class CreateHabitCommandHandler implements Command.Handler<CreateHabitCommand,CreateHabitResponse>{
        private final HabitRepository habitRepository;

        @Override
        public CreateHabitResponse handle(CreateHabitCommand createHabitCommand) {
            return null;
        }
    }
}
