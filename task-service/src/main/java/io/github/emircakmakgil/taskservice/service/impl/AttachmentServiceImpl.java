package io.github.emircakmakgil.taskservice.service.impl;

import io.github.emircakmakgil.taskservice.dto.attachment.AttachmentListiningDto;
import io.github.emircakmakgil.taskservice.dto.attachment.CreateAttachmentDto;
import io.github.emircakmakgil.taskservice.dto.attachment.DeleteAttachmentDto;
import io.github.emircakmakgil.taskservice.dto.attachment.UpdateAttachmentDto;
import io.github.emircakmakgil.taskservice.entity.Attachment;
import io.github.emircakmakgil.taskservice.service.AttachmentService;

import java.util.List;
import java.util.UUID;

public class AttachmentServiceImpl implements AttachmentService {
    @Override
    public void add(CreateAttachmentDto createAttachmentDto) {

    }

    @Override
    public List<AttachmentListiningDto> getAll() {
        return List.of();
    }

    @Override
    public Attachment update(UpdateAttachmentDto updateAttachmentDto) {
        return null;
    }

    @Override
    public void delete(DeleteAttachmentDto deleteAttachmentDto) {

    }

    @Override
    public Attachment findById(UUID id) {
        return null;
    }
}
