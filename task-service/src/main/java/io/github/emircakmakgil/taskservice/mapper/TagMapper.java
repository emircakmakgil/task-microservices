package io.github.emircakmakgil.taskservice.mapper;

import io.github.emircakmakgil.taskservice.dto.tag.CreateTagDto;
import io.github.emircakmakgil.taskservice.dto.tag.TagListiningDto;
import io.github.emircakmakgil.taskservice.dto.tag.UpdateTagDto;
import io.github.emircakmakgil.taskservice.entity.Tag;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
@Data
public class TagMapper {
    public Tag createTagFromCreatedTagDto(CreateTagDto createTagDto){
        return Tag
                .builder()
                .createdAt(LocalDate.now())
                .name(createTagDto.getName())
                .updatedAt(LocalDate.now())
                .build();
    }
    public Tag updateTagFromUpdatedDto(UpdateTagDto updateTagDto,Tag tag){
        return Tag
                .builder()
                .name(updateTagDto.getName())
                .updatedAt(updateTagDto.getUpdateAt())
                .build();
    }
    public TagListiningDto toTagListiningDto(Tag tag){
        return new TagListiningDto(
                tag.getName(),
                tag.getCreatedAt(),
                tag.getUpdatedAt()
        );
    }
}
