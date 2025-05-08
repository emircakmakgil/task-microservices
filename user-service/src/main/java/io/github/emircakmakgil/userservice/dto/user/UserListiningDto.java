package io.github.emircakmakgil.userservice.dto.user;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UserListiningDto {
    private String name;
    private String surname;
    private String phoneNumber;
    private String adress;
    private LocalDate birthDate;
    private String email;

    public UserListiningDto(String name, String surname, String adress, LocalDate birthDate, String email, String phoneNumber) {
        this.name=name;
        this.surname=surname;
        this.adress=adress;
        this.birthDate=birthDate;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }
}
