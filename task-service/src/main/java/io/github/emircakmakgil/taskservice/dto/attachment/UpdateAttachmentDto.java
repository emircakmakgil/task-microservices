package io.github.emircakmakgil.taskservice.dto.attachment;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

@Data
public class UpdateAttachmentDto {
    private UUID id;
    private MultipartFile file;
    private UUID taskId;
}
