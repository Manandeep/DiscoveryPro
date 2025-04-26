package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Domain {
    @Id @GeneratedValue
    private Long id;
    private String name;

    @ManyToOne
    private Workspace workspace;

    // Getters and setters
}
