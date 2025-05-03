package io.github.emircakmakgil.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.management.relation.Role;
import java.util.UUID;

public interface RoleRepository extends JpaRepository<Role, UUID> {
}
