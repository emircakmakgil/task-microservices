package io.github.emircakmakgil.taskservice.service;

import io.github.emircakmakgil.taskservice.dto.reminder.CreateRemainderDto;
import io.github.emircakmakgil.taskservice.dto.reminder.DeleteReminderDto;
import io.github.emircakmakgil.taskservice.dto.reminder.ReminderListiningDto;
import io.github.emircakmakgil.taskservice.dto.reminder.UpdateReminderDto;
import io.github.emircakmakgil.taskservice.entity.Task;

import java.util.List;
import java.util.UUID;

public interface ReminderService {
    void add(CreateRemainderDto createRemainderDto);
    List<ReminderListiningDto> getAll();
    Task update(UpdateReminderDto updateReminderDto);
    void delete(DeleteReminderDto deleteReminderDto);
    Task findById(UUID id);
}
