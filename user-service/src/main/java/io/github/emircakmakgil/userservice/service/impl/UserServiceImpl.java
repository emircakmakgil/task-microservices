package io.github.emircakmakgil.userservice.service.impl;

import io.github.emircakmakgil.userservice.dto.user.CreateUserDto;
import io.github.emircakmakgil.userservice.dto.user.DeleteUserDto;
import io.github.emircakmakgil.userservice.dto.user.UpdateUserDto;
import io.github.emircakmakgil.userservice.dto.user.UserListiningDto;
import io.github.emircakmakgil.userservice.entity.User;
import io.github.emircakmakgil.userservice.mapper.UserMapper;
import io.github.emircakmakgil.userservice.repository.UserRepository;
import io.github.emircakmakgil.userservice.service.UserService;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public void add(CreateUserDto createUserDto) {
        User user=userMapper.createUserFromCreateUserDto(createUserDto);
        userRepository.save(user);

    }

    @Override
    public List<UserListiningDto> getAll() {
        List<User> users=userRepository.findAll();
        List<UserListiningDto> userListiningDtos=
                users
                        .stream()
                        .map(userMapper::toUserListiningDto)
                        .collect(Collectors.toList());
        return userListiningDtos;
    }

    @Override
    public User update(UpdateUserDto updateUserDto) {
        User user=userRepository.findById(updateUserDto.getId()).orElseThrow(()-> new RuntimeException("User Not Found!"));
        userMapper.updateUserFromUpdatedUserDto(updateUserDto,user);
        return userRepository.save(user);
    }

    @Override
    public void delete(DeleteUserDto deleteUserDto) {
        User user=userRepository.findById(deleteUserDto.getId()).orElseThrow(()->new RuntimeException("User Not Found!"));
        userRepository.delete(user);

    }

    @Override
    public User findById(UUID id) {
        User user=userRepository.findById(id).orElseThrow(()->new RuntimeException("User Not Found!"));
        return user;
    }
}
