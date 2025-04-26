package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class SubDomain {
    @Id @GeneratedValue
    private Long id;
    private String name;

    @ManyToOne
    private Domain domain;

    // Getters and setters
}
