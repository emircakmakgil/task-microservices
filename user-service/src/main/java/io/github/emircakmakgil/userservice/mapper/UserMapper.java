package io.github.emircakmakgil.userservice.mapper;

import io.github.emircakmakgil.userservice.dto.user.CreateUserDto;
import io.github.emircakmakgil.userservice.dto.user.UpdateUserDto;
import io.github.emircakmakgil.userservice.dto.user.UserListiningDto;
import io.github.emircakmakgil.userservice.entity.User;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Data
public class UserMapper {
    public User createUserFromCreateUserDto(CreateUserDto createUserDto){
        return User
                .builder()
                .createdAt(LocalDateTime.now())
                .name(createUserDto.getName())
                .adress(createUserDto.getAdress())
                .updatedAt(LocalDateTime.now())
                .email(createUserDto.getEmail())
                .surname(createUserDto.getSurname())
                .phoneNumber(createUserDto.getPhoneNumber())
                .password(createUserDto.getPassword())
                .birthDate(createUserDto.getBirthDate())
                .build();
    }
    public User updateUserFromUpdatedUserDto(UpdateUserDto updateUserDto,User user){
        return User
                .builder()
                .name(updateUserDto.getName())
                .adress(updateUserDto.getAdress())
                .updatedAt(LocalDateTime.now())
                .surname(updateUserDto.getSurname())
                .phoneNumber(updateUserDto.getPhoneNumber())
                .password(updateUserDto.getPassword())
                .birthDate(updateUserDto.getBirthDate())
                .build();
    }
    public UserListiningDto toUserListiningDto(User user){
        return new UserListiningDto(
                user.getName(),
                user.getSurname(),
                user.getAdress(),
                user.getBirthDate(),
                user.getEmail(),
                user.getPhoneNumber());
    }
}
