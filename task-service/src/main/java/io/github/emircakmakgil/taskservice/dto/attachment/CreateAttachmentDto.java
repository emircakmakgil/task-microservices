package io.github.emircakmakgil.taskservice.dto.attachment;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;
import java.util.UUID;

@Getter
@Setter
public class CreateAttachmentDto {
    private MultipartFile file;
    private UUID taskId;
    private UUID uploaderId;
}
