package com.example.lifung.models;

import lombok.Data;

/**
 * @author Tai Nguyen
 */
@Data
public class TodoResponse extends TodoData{
    public static TodoResponse from(Todo todo) {
        TodoResponse response = new TodoResponse();
        response.setDescription(todo.getDescription());
        response.setName(todo.getName());
        response.setUserId(todo.getUserId());
        return response;
    }
}
