package com.example.lifung.models;

import jakarta.persistence.*;

/**
 * @author Tai Nguyen
 */
@Entity
@Table(name = "user_todo")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
