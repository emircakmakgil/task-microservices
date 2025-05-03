package io.github.emircakmakgil.userservice.repository;

import io.github.emircakmakgil.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User,UUID> {
}
