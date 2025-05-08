package io.github.emircakmakgil.taskservice.service.impl;

import io.github.emircakmakgil.taskservice.dto.reminder.CreateRemainderDto;
import io.github.emircakmakgil.taskservice.dto.reminder.DeleteReminderDto;
import io.github.emircakmakgil.taskservice.dto.reminder.ReminderListiningDto;
import io.github.emircakmakgil.taskservice.dto.reminder.UpdateReminderDto;
import io.github.emircakmakgil.taskservice.entity.Task;
import io.github.emircakmakgil.taskservice.service.ReminderService;

import java.util.List;
import java.util.UUID;

public class ReminderServiceImpl implements ReminderService {
    @Override
    public void add(CreateRemainderDto createRemainderDto) {

    }

    @Override
    public List<ReminderListiningDto> getAll() {
        return List.of();
    }

    @Override
    public Task update(UpdateReminderDto updateReminderDto) {
        return null;
    }

    @Override
    public void delete(DeleteReminderDto deleteReminderDto) {

    }

    @Override
    public Task findById(UUID id) {
        return null;
    }
}
