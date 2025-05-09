package io.github.emircakmakgil.taskservice.dto.attachment;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AttachmentListiningDto {
    private UUID id;
    private String fileName;
    private String fileType;
    private Long fileSize;
    private UUID uploaderId;
    private LocalDateTime createdAt;
}
