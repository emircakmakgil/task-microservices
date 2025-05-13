package io.github.emircakmakgil.habitservice.controllers;

import an.awesome.pipelinr.Pipeline;
import io.github.emircakmakgil.habitservice.application.habit.command.create.CreateHabitCommand;
import io.github.emircakmakgil.habitservice.application.habit.command.create.CreateHabitResponse;
import io.github.emircakmakgil.habitservice.core.web.BaseController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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


}
