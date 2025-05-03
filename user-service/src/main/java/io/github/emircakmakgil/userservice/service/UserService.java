package io.github.emircakmakgil.userservice.service;

import io.github.emircakmakgil.userservice.dto.user.CreateUserDto;
import io.github.emircakmakgil.userservice.dto.user.DeleteUserDto;
import io.github.emircakmakgil.userservice.dto.user.UpdateUserDto;
import io.github.emircakmakgil.userservice.dto.user.UserListiningDto;
import io.github.emircakmakgil.userservice.entity.User;

import java.util.List;
import java.util.UUID;

public interface UserService {
    void add(CreateUserDto createUserDto);
    List<UserListiningDto> getAll();
    User update(UpdateUserDto updateUserDto);
    void delete(DeleteUserDto deleteUserDto);
    User findById(UUID id);
}
