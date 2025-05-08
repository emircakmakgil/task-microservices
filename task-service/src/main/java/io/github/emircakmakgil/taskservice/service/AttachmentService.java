package io.github.emircakmakgil.taskservice.service;


import io.github.emircakmakgil.taskservice.dto.attachment.AttachmentListiningDto;
import io.github.emircakmakgil.taskservice.dto.attachment.CreateAttachmentDto;
import io.github.emircakmakgil.taskservice.dto.attachment.DeleteAttachmentDto;
import io.github.emircakmakgil.taskservice.dto.attachment.UpdateAttachmentDto;
import io.github.emircakmakgil.taskservice.entity.Attachment;

import java.util.List;
import java.util.UUID;

public interface AttachmentService {
    void add(CreateAttachmentDto createAttachmentDto);
    List<AttachmentListiningDto> getAll();
    Attachment update(UpdateAttachmentDto updateAttachmentDto);
    void delete(DeleteAttachmentDto deleteAttachmentDto);
    Attachment findById(UUID id);
}
