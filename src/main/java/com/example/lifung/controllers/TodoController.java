package com.example.lifung.controllers;

import com.example.lifung.models.TodoRequest;
import com.example.lifung.models.TodoResponse;
import com.example.lifung.services.TotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Tai Nguyen
 */
@RestController
@RequestMapping("/todo")
@CrossOrigin(origins = "http://localhost:3000")
public class TodoController {
    @Autowired
    private TotoService totoService;

    @GetMapping("/get")
    public List<TodoResponse> getList() {
        return totoService.getListTodo();
    }

    @GetMapping("/get/{userId}")
    public List<TodoResponse> getByUser(@PathVariable Long userId) {
        return totoService.getByUser(userId);
    }

    @PostMapping("/create")
    public void create(@RequestBody TodoRequest todo) {
        totoService.save(todo);
    }
}
