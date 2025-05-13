package io.github.emircakmakgil.habitservice.application.habit.query.getlist;

import an.awesome.pipelinr.Command;
import io.github.emircakmakgil.habitservice.domain.entity.Habit;
import io.github.emircakmakgil.habitservice.persistence.habit.HabitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
public class GetListHabitQuery implements Command<List<GetListHabitItemDto>> {

    @Component
    @RequiredArgsConstructor
    private static class GetListHabitQueryHandler implements Command.Handler<GetListHabitQuery,List<GetListHabitItemDto>>{
        private final HabitRepository habitRepository;
        @Override
        public List<GetListHabitItemDto> handle(GetListHabitQuery getListHabitQuery) {
            List<Habit> habits=habitRepository.findAll();
            List<GetListHabitItemDto> habitItemDtos=habits.stream()
                    .map(habit->new GetListHabitItemDto
                            (habit.getName()
                                    ,habit.getDescription()
                                    ,habit.getFrequencyType(),
                                    habit.getTargetCount()))
                    .toList();
            return habitItemDtos;
        }
    }
}
