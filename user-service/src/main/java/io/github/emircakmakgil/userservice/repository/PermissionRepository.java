package io.github.emircakmakgil.userservice.repository;

import io.github.emircakmakgil.userservice.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PermissionRepository extends JpaRepository<Permission, UUID> {
}
