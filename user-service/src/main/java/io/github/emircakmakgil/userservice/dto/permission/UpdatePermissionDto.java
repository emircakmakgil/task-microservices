package io.github.emircakmakgil.userservice.dto.permission;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class UpdatePermissionDto {
    private UUID id;
    private String name;
    private String description;
}
