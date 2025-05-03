package io.github.emircakmakgil.userservice.service;

import io.github.emircakmakgil.userservice.dto.role.CreateRoleDto;
import io.github.emircakmakgil.userservice.dto.role.DeleteRoleDto;
import io.github.emircakmakgil.userservice.dto.role.RoleListiningDto;
import io.github.emircakmakgil.userservice.dto.role.UpdateRoleDto;

import javax.management.relation.Role;
import java.util.List;
import java.util.UUID;

public interface RoleService {
    void add(CreateRoleDto createRoleDto);
    List<RoleListiningDto> getAll();
    Role update(UpdateRoleDto updateRoleDto);
    void delete(DeleteRoleDto deleteRoleDto);
    Role findById(UUID id);

}
