package io.github.emircakmakgil.userservice.dto.role;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class UpdateRoleDto {
    private UUID id;
    private String name;
    private String description;
}
