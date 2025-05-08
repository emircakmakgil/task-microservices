package io.github.emircakmakgil.taskservice.service;



import io.github.emircakmakgil.taskservice.dto.progress.CreateProgressDto;
import io.github.emircakmakgil.taskservice.dto.progress.DeleteProgressDto;
import io.github.emircakmakgil.taskservice.dto.progress.ProgressListiningDto;
import io.github.emircakmakgil.taskservice.dto.progress.UpdateProgressDto;
import io.github.emircakmakgil.taskservice.entity.Progress;

import java.util.List;
import java.util.UUID;

public interface ProgressService {
    void add(CreateProgressDto createProgressDto);
    List<ProgressListiningDto> getAll();
    Progress update(UpdateProgressDto updateProgressDto);
    void delete(DeleteProgressDto deleteProgressDto);
    Progress findById(UUID id);
}
