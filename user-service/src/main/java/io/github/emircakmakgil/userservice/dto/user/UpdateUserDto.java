package io.github.emircakmakgil.userservice.dto.user;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
public class UpdateUserDto {
    private UUID id;
    private String name;
    private String surname;
    private String phoneNumber;
    private String adress;
    private LocalDate birthDate;
    private String password;
}
