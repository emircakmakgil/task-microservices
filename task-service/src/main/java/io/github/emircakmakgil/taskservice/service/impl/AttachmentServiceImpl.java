package io.github.emircakmakgil.taskservice.service.impl;

import io.github.emircakmakgil.taskservice.dto.attachment.AttachmentListiningDto;
import io.github.emircakmakgil.taskservice.entity.Attachment;
import io.github.emircakmakgil.taskservice.entity.Task;
import io.github.emircakmakgil.taskservice.mapper.AttachmentMapper;
import io.github.emircakmakgil.taskservice.repository.AttachmentRepository;
import io.github.emircakmakgil.taskservice.repository.TaskRepository;
import io.github.emircakmakgil.taskservice.service.AttachmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AttachmentServiceImpl implements AttachmentService {
    
    private final AttachmentRepository attachmentRepository;
    private final TaskRepository taskRepository;
    private final AttachmentMapper attachmentMapper;
    private final Path fileStorageLocation = Paths.get("uploads").toAbsolutePath().normalize();

    @Override
    public void uploadFile(MultipartFile file, UUID taskId, UUID uploaderId) {
        try {
            // Create uploads directory if it doesn't exist
            Files.createDirectories(fileStorageLocation);
            
            // Get file information
            String fileName = file.getOriginalFilename();
            String fileExtension = fileName.substring(fileName.lastIndexOf("."));
            String newFileName = UUID.randomUUID().toString() + fileExtension;
            
            // Save file to disk
            Path targetLocation = fileStorageLocation.resolve(newFileName);
            Files.copy(file.getInputStream(), targetLocation);
            
            // Get task
            Task task = taskRepository.findById(taskId)
                    .orElseThrow(() -> new RuntimeException("Task not found"));
            
            // Create and save attachment entity
            Attachment attachment = attachmentMapper.createAttachmentFromFile(file, targetLocation.toString(), uploaderId);
            attachment.setTask(task);
            attachmentRepository.save(attachment);
            
        } catch (IOException ex) {
            throw new RuntimeException("Could not store file. Please try again!", ex);
        }
    }

    @Override
    public List<AttachmentListiningDto> getAll() {
        return attachmentRepository.findAll().stream()
                .map(attachmentMapper::toAttachmentListiningDto)
                .collect(Collectors.toList());
    }

    @Override
    public AttachmentListiningDto getById(UUID id) {
        Attachment attachment = attachmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Attachment not found"));
        return attachmentMapper.toAttachmentListiningDto(attachment);
    }

    @Override
    public void updateFile(UUID id, MultipartFile file, UUID taskId) {
        Attachment attachment = attachmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Attachment not found"));

        if (file != null) {
            try {
                // Delete old file
                Files.deleteIfExists(Paths.get(attachment.getFilePath()));
                
                // Save new file
                String fileName = file.getOriginalFilename();
                String fileExtension = fileName.substring(fileName.lastIndexOf("."));
                String newFileName = UUID.randomUUID().toString() + fileExtension;
                
                Path targetLocation = fileStorageLocation.resolve(newFileName);
                Files.copy(file.getInputStream(), targetLocation);
                
                // Update attachment
                attachment = attachmentMapper.updateAttachmentFromFile(file, attachment, targetLocation.toString());
                
            } catch (IOException ex) {
                throw new RuntimeException("Could not update file. Please try again!", ex);
            }
        }

        if (taskId != null) {
            Task task = taskRepository.findById(taskId)
                    .orElseThrow(() -> new RuntimeException("Task not found"));
            attachment.setTask(task);
        }

        attachmentRepository.save(attachment);
    }

    @Override
    public void deleteFile(UUID id) {
        Attachment attachment = attachmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Attachment not found"));
        
        try {
            // Delete file from disk
            Files.deleteIfExists(Paths.get(attachment.getFilePath()));
            // Delete from database
            attachmentRepository.delete(attachment);
        } catch (IOException ex) {
            throw new RuntimeException("Could not delete file. Please try again!", ex);
        }
    }

    @Override
    public Attachment findById(UUID id) {
        return attachmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Attachment not found"));
    }
}
