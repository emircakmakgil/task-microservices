package io.github.emircakmakgil.habitservice.controllers;

import an.awesome.pipelinr.Pipeline;
import io.github.emircakmakgil.habitservice.application.habit.command.create.CreateHabitCommand;
import io.github.emircakmakgil.habitservice.application.habit.command.create.CreateHabitResponse;
import io.github.emircakmakgil.habitservice.application.habit.command.update.UpdateHabitCommand;
import io.github.emircakmakgil.habitservice.application.habit.command.update.UpdateHabitResponse;
import io.github.emircakmakgil.habitservice.application.habit.query.getlist.GetListHabitItemDto;
import io.github.emircakmakgil.habitservice.application.habit.query.getlist.GetListHabitQuery;
import io.github.emircakmakgil.habitservice.core.web.BaseController;
import io.github.emircakmakgil.habitservice.domain.entity.Habit;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/habits")
public class HabitController extends BaseController {

    public HabitController(Pipeline pipeline) {
        super(pipeline);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public CreateHabitResponse create(@RequestBody CreateHabitCommand createHabitCommand)
    {
        return createHabitCommand.execute(pipeline);
    }
    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    public List<GetListHabitItemDto> get(){
        GetListHabitQuery query=new GetListHabitQuery();
        return query.execute(pipeline);
    }
    @PutMapping
    @ResponseStatus(code = HttpStatus.OK)
    public UpdateHabitResponse update(@RequestBody UpdateHabitCommand updateHabitCommand){
        return updateHabitCommand.execute(pipeline);
    }

}
