package io.github.emircakmakgil.taskservice.mapper;

import io.github.emircakmakgil.taskservice.dto.attachment.AttachmentListiningDto;
import io.github.emircakmakgil.taskservice.entity.Attachment;
import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;
import java.util.UUID;

@Component
@Data
public class AttachmentMapper {
    public Attachment createAttachmentFromFile(MultipartFile file, String filePath, UUID uploaderId) {
        return Attachment.builder()
                .fileName(file.getOriginalFilename())
                .filePath(filePath)
                .fileType(file.getContentType())
                .fileSize(file.getSize())
                .uploaderId(uploaderId)
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();
    }

    public Attachment updateAttachmentFromFile(MultipartFile file, Attachment attachment, String filePath) {
        attachment.setFileName(file.getOriginalFilename());
        attachment.setFilePath(filePath);
        attachment.setFileType(file.getContentType());
        attachment.setFileSize(file.getSize());
        attachment.setUpdatedAt(LocalDateTime.now());
        return attachment;
    }

    public AttachmentListiningDto toAttachmentListiningDto(Attachment attachment) {
        return AttachmentListiningDto.builder()
                .id(attachment.getId())
                .fileName(attachment.getFileName())
                .fileType(attachment.getFileType())
                .fileSize(attachment.getFileSize())
                .uploaderId(attachment.getUploaderId())
                .createdAt(attachment.getCreatedAt())
                .build();
    }
}
