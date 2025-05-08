package io.github.emircakmakgil.taskservice.dto.tag;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
public class UpdateTagDto {
    private UUID id;
    private String name;
    private LocalDate createAt;
    private LocalDate updateAt;
}
