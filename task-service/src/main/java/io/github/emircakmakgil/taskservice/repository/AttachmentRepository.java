package io.github.emircakmakgil.taskservice.repository;

import io.github.emircakmakgil.taskservice.entity.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AttachmentRepository extends JpaRepository<Attachment, UUID> {
}
