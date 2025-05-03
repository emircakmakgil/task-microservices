package io.github.emircakmakgil.userservice.service.impl;

import io.github.emircakmakgil.userservice.dto.user.CreateUserDto;
import io.github.emircakmakgil.userservice.dto.user.DeleteUserDto;
import io.github.emircakmakgil.userservice.dto.user.UpdateUserDto;
import io.github.emircakmakgil.userservice.dto.user.UserListiningDto;
import io.github.emircakmakgil.userservice.entity.User;
import io.github.emircakmakgil.userservice.service.UserService;

import java.util.List;
import java.util.UUID;

public class UserServiceImpl implements UserService {
    @Override
    public void add(CreateUserDto createUserDto) {

    }

    @Override
    public List<UserListiningDto> getAll() {
        return List.of();
    }

    @Override
    public User update(UpdateUserDto updateUserDto) {
        return null;
    }

    @Override
    public void delete(DeleteUserDto deleteUserDto) {

    }

    @Override
    public User findById(UUID id) {
        return null;
    }
}
