package com.example.lifung.models;

import jakarta.persistence.*;
import lombok.Data;

/**
 * @author Tai Nguyen
 */
@Entity
@Table(name = "todo")
@Data
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Long userId;
}
