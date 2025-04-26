package com.example.demo.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class DataProduct {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String description;
    private String technicalDetails;
    private String owner;

    @ManyToOne
    private Domain domain;

    @ManyToOne
    private SubDomain subDomain;

    @ManyToMany
    private List<Workspace> workspaces;

    // Getters and setters
}
