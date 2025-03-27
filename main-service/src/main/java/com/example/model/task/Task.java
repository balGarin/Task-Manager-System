package com.example.model.task;

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
//    @OneToMany
//    @JoinColumn(name = "user_id")
//    private User author;
//    @OneToOne
//    @JoinColumn(name = "user_id")
//    private User executor;
    @Column(name = "author_name")
    private String authorName;
    private String executorName;
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



