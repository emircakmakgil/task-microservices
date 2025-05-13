package io.github.emircakmakgil.habitservice.application.habit.command.update;

import an.awesome.pipelinr.Command;
import io.github.emircakmakgil.habitservice.domain.entity.Habit;
import io.github.emircakmakgil.habitservice.enums.FrequencyType;
import io.github.emircakmakgil.habitservice.persistence.habit.HabitRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.UUID;
@Getter
@Setter
public class UpdateHabitCommand implements Command<UpdateHabitResponse>{
    private UUID id;
    private String name;
    private String description;
    private FrequencyType frequencyType;
    private Integer targetCount;
    private LocalDate updateAt;


    @Component
    @RequiredArgsConstructor
    private static class UpdateHabitCommandHandler implements Command.Handler<UpdateHabitCommand,UpdateHabitResponse>{

        private final HabitRepository habitRepository;


        @Override
        public UpdateHabitResponse handle(UpdateHabitCommand command) {
            Habit habit=habitRepository.findById(command.getId()).orElseThrow(()-> new RuntimeException("Habit Not Found!"));
            habit.setName(command.name);
            habit.setDescription(command.getDescription());
            habit.setFrequencyType(command.getFrequencyType());
            habit.setTargetCount(command.getTargetCount());
            habit.setUpdatedAt(LocalDate.now());
            habitRepository.save(habit);
            return new UpdateHabitResponse(habit.getDescription()
                    ,habit.getName()
                    ,habit.getUpdatedAt()
            ,habit.getFrequencyType(),
                    habit.getTargetCount());
        }
    }

}
