package io.github.emircakmakgil.userservice.dto.user;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class CreateUserDto {
    private String name;
    private String surname;
    private String phoneNumber;
    private String adress;
    private LocalDate birthDate;

}
