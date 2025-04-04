package com.example.model.task;

import com.example.model.user.User;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id")
    private Long id;
    private String title;
    private String description;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author;
    @OneToOne
    @JoinColumn(name = "executor_id")
    private User executor;
    @ElementCollection
    @CollectionTable(name = "comments",joinColumns = @JoinColumn(name = "task_id"))
    @Column(name = "commentText")
    private List<String> comments;
    @Enumerated(EnumType.STRING)
    private Status status;
    @Enumerated(EnumType.STRING)
    private Priority priority;

    public enum Status{
        WAITING,
        IN_PROGRESS,
        DONE
    }
    public  enum Priority{
        LOW,
        MID,
        HIGH
    }
}



