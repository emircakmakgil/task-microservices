package io.github.emircakmakgil.userservice.service.impl;

import io.github.emircakmakgil.userservice.dto.role.CreateRoleDto;
import io.github.emircakmakgil.userservice.dto.role.DeleteRoleDto;
import io.github.emircakmakgil.userservice.dto.role.RoleListiningDto;
import io.github.emircakmakgil.userservice.dto.role.UpdateRoleDto;
import io.github.emircakmakgil.userservice.service.RoleService;

import javax.management.relation.Role;
import java.util.List;
import java.util.UUID;

public class RoleServiceImpl implements RoleService {
    @Override
    public void add(CreateRoleDto createRoleDto) {

    }

    @Override
    public List<RoleListiningDto> getAll() {
        return List.of();
    }

    @Override
    public Role update(UpdateRoleDto updateRoleDto) {
        return null;
    }

    @Override
    public void delete(DeleteRoleDto deleteRoleDto) {

    }

    @Override
    public Role findById(UUID id) {
        return null;
    }
}
