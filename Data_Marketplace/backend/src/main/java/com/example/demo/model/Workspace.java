package com.example.demo.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Workspace {
    @Id @GeneratedValue
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "workspaces")
    private List<User> users;

    // Getters and setters
}
