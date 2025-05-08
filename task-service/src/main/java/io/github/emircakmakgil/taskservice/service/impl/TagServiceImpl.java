package io.github.emircakmakgil.taskservice.service.impl;

import io.github.emircakmakgil.taskservice.dto.tag.CreateTagDto;
import io.github.emircakmakgil.taskservice.dto.tag.DeleteTagDto;
import io.github.emircakmakgil.taskservice.dto.tag.TagListiningDto;
import io.github.emircakmakgil.taskservice.dto.tag.UpdateTagDto;
import io.github.emircakmakgil.taskservice.entity.Tag;
import io.github.emircakmakgil.taskservice.mapper.TagMapper;
import io.github.emircakmakgil.taskservice.repository.TagRepository;
import io.github.emircakmakgil.taskservice.service.TagService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class TagServiceImpl implements TagService {
    private final TagRepository tagRepository;
    private final TagMapper tagMapper;

    public TagServiceImpl(TagRepository tagRepository, TagMapper tagMapper) {
        this.tagRepository = tagRepository;
        this.tagMapper = tagMapper;
    }


    @Override
    public void add(CreateTagDto createTagDto) {
        Tag tag=tagMapper.createTagFromCreatedTagDto(createTagDto);
        tagRepository.save(tag);
    }

    @Override
    public List<TagListiningDto> getAll() {
        List<Tag> tag=tagRepository.findAll();
        List<TagListiningDto> tagListiningDtos=tag.stream().map(tagMapper::toTagListiningDto).collect(Collectors.toList());
        return tagListiningDtos;
    }

    @Override
    public Tag update(UpdateTagDto updateTagDto) {
        Tag tag=tagRepository.findById(updateTagDto.getId()).orElseThrow(()-> new RuntimeException("Tag Not Found!"));
        tagMapper.updateTagFromUpdatedDto(updateTagDto,tag);
        return tagRepository.save(tag);
    }

    @Override
    public void delete(DeleteTagDto deleteTagDto) {
        Tag tag=tagRepository.findById(deleteTagDto.getId()).orElseThrow(()-> new RuntimeException("Tag Not Found!"));
        tagRepository.delete(tag);
    }

    @Override
    public Tag findById(UUID id) {
        Tag tag=tagRepository.findById(id).orElseThrow(()-> new RuntimeException("Tag Not Found!"));
        return tag;
    }
}
