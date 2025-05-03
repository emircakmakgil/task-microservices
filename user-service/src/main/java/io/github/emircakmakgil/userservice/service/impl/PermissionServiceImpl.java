package io.github.emircakmakgil.userservice.service.impl;

import io.github.emircakmakgil.userservice.dto.permission.CreatePermissionDto;
import io.github.emircakmakgil.userservice.dto.permission.DeletePermissionDto;
import io.github.emircakmakgil.userservice.dto.permission.PermissionListiningDto;
import io.github.emircakmakgil.userservice.dto.permission.UpdatePermissionDto;
import io.github.emircakmakgil.userservice.entity.Permission;
import io.github.emircakmakgil.userservice.mapper.PermissionMapper;
import io.github.emircakmakgil.userservice.repository.PermissionRepository;
import io.github.emircakmakgil.userservice.service.PermissionService;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class PermissionServiceImpl implements PermissionService {
    private final PermissionRepository permissionRepository;
    private final PermissionMapper permissionMapper;

    public PermissionServiceImpl(PermissionRepository permissionRepository, PermissionMapper permissionMapper) {
        this.permissionRepository = permissionRepository;
        this.permissionMapper = permissionMapper;
    }

    @Override
    public void add(CreatePermissionDto createPermissionDto) {
        Permission permission=permissionMapper.createPermissionFromCreatePermissionDto(createPermissionDto);
        permissionRepository.save(permission);
    }

    @Override
    public List<PermissionListiningDto> getAll() {
        List<Permission> permissions=permissionRepository.findAll();
        List<PermissionListiningDto>permissionListiningDtos=permissions
                .stream()
                .map(permissionMapper::toPermissionListiningDto)
                .collect(Collectors.toList());
        return permissionListiningDtos;
    }

    @Override
    public Permission update(UpdatePermissionDto updatePermissionDto) {
        Permission permission=permissionRepository.findById(updatePermissionDto.getId()).orElseThrow(()-> new RuntimeException("Permission Not Found"));
        permissionMapper.updatePermissionFromUpdatedPermissionDto(updatePermissionDto,permission);
        return permissionRepository.save(permission);


    }

    @Override
    public void delete(DeletePermissionDto deletePermissionDto) {
        Permission permission=permissionRepository.findById(deletePermissionDto.getId()).orElseThrow(()->new RuntimeException("Permission Not Found"));
        permissionRepository.delete(permission);

    }

    @Override
    public Permission findById(UUID id) {
        Permission permission=permissionRepository.findById(id).orElseThrow((()-> new RuntimeException("Permissin Not Found")));

        return permission;
    }
}
