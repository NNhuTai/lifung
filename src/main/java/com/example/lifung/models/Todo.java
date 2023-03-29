package com.example.lifung.models;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Tai Nguyen
 */
@Entity
@Table(name = "todo")
@Data
public class Todo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    @ManyToOne(fetch = FetchType.EAGER)
    private User user;
}
