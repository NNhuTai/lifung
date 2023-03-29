package com.example.lifung.models;

import lombok.Data;

/**
 * @author Tai Nguyen
 */
public class TodoResponse extends TodoData{
    public static TodoResponse from(Todo todo) {
        TodoResponse response = new TodoResponse();
        response.setId(todo.getId());
        response.setDescription(todo.getDescription());
        response.setName(todo.getName());
        response.setUserId(todo.getUserId());
        return response;
    }
}
