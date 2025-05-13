package io.github.emircakmakgil.taskservice.service;

import io.github.emircakmakgil.taskservice.dto.attachment.AttachmentListiningDto;
import io.github.emircakmakgil.taskservice.dto.attachment.FileDataDto;
import io.github.emircakmakgil.taskservice.entity.Attachment;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

public interface AttachmentService {
    void uploadFile(MultipartFile file, UUID taskId, UUID uploaderId);
    List<AttachmentListiningDto> getAll();
    AttachmentListiningDto getById(UUID id);
    void updateFile(UUID id, MultipartFile file, UUID taskId);
    void deleteFile(UUID id);
    Attachment findById(UUID id);
    FileDataDto downloadFile(UUID id);
}
