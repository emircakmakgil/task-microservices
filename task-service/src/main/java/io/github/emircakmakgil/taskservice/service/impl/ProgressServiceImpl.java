package io.github.emircakmakgil.taskservice.service.impl;

import io.github.emircakmakgil.taskservice.dto.progress.CreateProgressDto;
import io.github.emircakmakgil.taskservice.dto.progress.DeleteProgressDto;
import io.github.emircakmakgil.taskservice.dto.progress.ProgressListiningDto;
import io.github.emircakmakgil.taskservice.dto.progress.UpdateProgressDto;
import io.github.emircakmakgil.taskservice.entity.Progress;
import io.github.emircakmakgil.taskservice.service.ProgressService;

import java.util.List;
import java.util.UUID;

public class ProgressServiceImpl implements ProgressService {
    @Override
    public void add(CreateProgressDto createProgressDto) {

    }

    @Override
    public List<ProgressListiningDto> getAll() {
        return List.of();
    }

    @Override
    public Progress update(UpdateProgressDto updateProgressDto) {
        return null;
    }

    @Override
    public void delete(DeleteProgressDto deleteProgressDto) {

    }

    @Override
    public Progress findById(UUID id) {
        return null;
    }
}
