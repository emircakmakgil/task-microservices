package io.github.emircakmakgil.userservice.mapper;

import io.github.emircakmakgil.userservice.dto.role.CreateRoleDto;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.management.relation.Role;

@Component
@Data
public class RoleMapper {
    public Role createRoleFromCreateUserDto(CreateRoleDto createRoleDto){
        return null;
    }
}
