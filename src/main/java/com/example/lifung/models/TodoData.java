package com.example.lifung.models;

import lombok.Data;

/**
 * @author Tai Nguyen
 */
@Data
public class TodoData {
    private Long id;
    private String name;
    private String description;
    private Long userId;
    private UserData user;
}
