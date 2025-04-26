package com.example.demo.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private String role; // ADMIN, USER, SUPERUSER

    @ManyToMany
    private List<Workspace> workspaces;

    // Getters and setters
}
