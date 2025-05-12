package io.github.emircakmakgil.taskservice.entity;

import io.github.emircakmakgil.taskservice.enums.Priority;
import io.github.emircakmakgil.taskservice.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "tasks")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Task {
    @Id
    @UuidGenerator
    private UUID id;

    @Column(nullable = false)
    private String title;

    private String description;

    @Column(name = "due_date")
    private LocalDateTime dueDate;

    @Column(name = "start_date")
    private LocalDateTime startDate;

    @Column(name = "end_date")
    private LocalDateTime endDate;

    @Column(name = "estimated_duration")
    private Integer estimatedDuration;

    @Column(name = "actual_duration")
    private Integer actualDuration;

    @Enumerated(EnumType.STRING)
    @Column(name="priority")
    private Priority priority;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(name = "user_id", nullable = false)
    private UUID userId;

    @ManyToOne
    @JoinColumn(name = "parent_task_id")
    private Task parentTask; //TODO: SELF-REFERANCE TABLE BAK

    @OneToMany(mappedBy = "parentTask")
    private Set<Task> subtasks;

    @Column(name = "recurrence_pattern")
    private String recurrencePattern;

    @Column(name = "is_recurring")
    private boolean isRecurring;

    @Column(name = "recurrence_end_date")
    private LocalDateTime recurrenceEndDate;

    @ManyToMany
    @JoinTable(
        name = "task_tag_relations",
        joinColumns = @JoinColumn(name = "task_id"),
        inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    private Set<Tag> tags;



    @OneToMany(mappedBy = "task", cascade = CascadeType.ALL)
    private Set<Attachment> attachments;



    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name = "tag_id", nullable = false)
    private Tag tag;
}
