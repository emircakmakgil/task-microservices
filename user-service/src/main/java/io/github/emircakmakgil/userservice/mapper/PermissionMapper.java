package io.github.emircakmakgil.userservice.mapper;


import io.github.emircakmakgil.userservice.dto.permission.CreatePermissionDto;
import io.github.emircakmakgil.userservice.dto.permission.PermissionListiningDto;
import io.github.emircakmakgil.userservice.dto.permission.UpdatePermissionDto;
import io.github.emircakmakgil.userservice.entity.Permission;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Data
public class PermissionMapper {
    public Permission createPermissionFromCreatePermissionDto(CreatePermissionDto createPermissionDto){
        return Permission
                .builder()
                .name(createPermissionDto.getName())
                .description(createPermissionDto.getDescription())
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();
    }
    public Permission updatePermissionFromUpdatedPermissionDto(UpdatePermissionDto updatePermissionDto,Permission permission){
        return Permission
                .builder()
                .updatedAt(LocalDateTime.now())
                .name(updatePermissionDto.getName())
                .description(updatePermissionDto.getDescription())
                .build();
    }
    public PermissionListiningDto toPermissionListiningDto(Permission permission){
        return new PermissionListiningDto(
                permission.getName(),
                permission.getDescription()
        );

    }

}
