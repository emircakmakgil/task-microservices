package io.github.emircakmakgil.taskservice.dto.tag;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class CreateTagDto {
    private String name;
    private LocalDate createAt;
    private LocalDate updateAt;

}
