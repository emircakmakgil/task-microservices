package io.github.emircakmakgil.habitservice.application.habit.command.create;

import an.awesome.pipelinr.Command;
import io.github.emircakmakgil.habitservice.persistence.habit.HabitRepository;
import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateHabitCommand implements Command<CreateHabitResponse> {

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
