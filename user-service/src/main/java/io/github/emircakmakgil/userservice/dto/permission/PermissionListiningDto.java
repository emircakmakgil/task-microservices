package io.github.emircakmakgil.userservice.dto.permission;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PermissionListiningDto {
    private String name;
    private String description;

    public PermissionListiningDto(String name, String description) {
        this.description=description;
        this.name=name;
    }
}
