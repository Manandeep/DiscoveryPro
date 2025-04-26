package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Comment {
    @Id @GeneratedValue
    private Long id;
    private String text;
    private LocalDateTime timestamp;

    @ManyToOne
    private User user;

    @ManyToOne
    private DataProduct dataProduct;

    // Getters and setters
}
