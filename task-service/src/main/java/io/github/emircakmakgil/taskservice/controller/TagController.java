package io.github.emircakmakgil.taskservice.controller;

import io.github.emircakmakgil.taskservice.dto.tag.CreateTagDto;
import io.github.emircakmakgil.taskservice.dto.tag.DeleteTagDto;
import io.github.emircakmakgil.taskservice.dto.tag.TagListiningDto;
import io.github.emircakmakgil.taskservice.dto.tag.UpdateTagDto;
import io.github.emircakmakgil.taskservice.service.TagService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/tag")
public class TagController {
    private final TagService tagService;

    public TagController(TagService tagService) {
        this.tagService = tagService;
    }
    @PostMapping
    public void createTag(@RequestBody CreateTagDto createTagDto){
        this.tagService.add(createTagDto);
    }
    @PutMapping
    public void updateTag(@RequestBody UpdateTagDto updateTagDto){
        this.tagService.update(updateTagDto);
    }
    @DeleteMapping
    public void deleteTag(@RequestBody DeleteTagDto deleteTagDto){
        this.tagService.delete(deleteTagDto);
    }
    @GetMapping
    public List<TagListiningDto> getAllTag(){
        return this.tagService.getAll();
    }
}
