package io.github.emircakmakgil.userservice.dto.user;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class DeleteUserDto {
    private UUID id;
}
