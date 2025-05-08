package io.github.emircakmakgil.taskservice.repository;

import io.github.emircakmakgil.taskservice.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TagRepository extends JpaRepository<Tag, UUID> {
}
