package io.github.emircakmakgil.userservice.service;

import io.github.emircakmakgil.userservice.dto.permission.CreatePermissionDto;
import io.github.emircakmakgil.userservice.dto.permission.DeletePermissionDto;
import io.github.emircakmakgil.userservice.dto.permission.PermissionListiningDto;
import io.github.emircakmakgil.userservice.dto.permission.UpdatePermissionDto;
import io.github.emircakmakgil.userservice.entity.Permission;

import java.util.List;
import java.util.UUID;

public interface PermissionService {
    void add(CreatePermissionDto createPermissionDto);
    List<PermissionListiningDto> getAll();
    Permission update(UpdatePermissionDto updatePermissionDto);
    void delete(DeletePermissionDto deletePermissionDto);
    Permission findById(UUID id);
}
