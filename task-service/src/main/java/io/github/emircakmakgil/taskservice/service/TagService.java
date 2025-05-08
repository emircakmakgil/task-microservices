package io.github.emircakmakgil.taskservice.service;



import io.github.emircakmakgil.taskservice.dto.tag.CreateTagDto;
import io.github.emircakmakgil.taskservice.dto.tag.DeleteTagDto;
import io.github.emircakmakgil.taskservice.dto.tag.TagListiningDto;
import io.github.emircakmakgil.taskservice.dto.tag.UpdateTagDto;
import io.github.emircakmakgil.taskservice.entity.Tag;

import java.util.List;
import java.util.UUID;

public interface TagService {
    void add(CreateTagDto createTagDto);
    List<TagListiningDto> getAll();
    Tag update(UpdateTagDto updateTagDto);
    void delete(DeleteTagDto deleteTagDto);
    Tag findById(UUID id);
}
