package io.github.emircakmakgil.taskservice.dto.tag;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class TagListiningDto {
    private String name;
    private LocalDate createAt;
    private LocalDate updateAt;

    public TagListiningDto(String name, LocalDate createAt,LocalDate updateAt) {
        this.name=name;
        this.createAt=createAt;
        this.updateAt=updateAt;
    }
}
