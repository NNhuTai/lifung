package com.example.lifung.models;

import lombok.Data;

/**
 * @author Tai Nguyen
 */
@Data
public class TodoData {
    private String name;
    private String description;
    private Long userId;
}
