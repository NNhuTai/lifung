package com.example.lifung.services;

import com.example.lifung.models.Todo;
import com.example.lifung.models.TodoRequest;
import com.example.lifung.models.TodoResponse;
import com.example.lifung.models.User;
import com.example.lifung.repo.TodoRepo;
import com.example.lifung.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Tai Nguyen
 */
@Service
public class TotoService {
    @Autowired
    private TodoRepo todoRepo;
    @Autowired
    private UserRepo userRepo;
    public List<TodoResponse> getListTodo() {
        return todoRepo.findAll().stream().map(TodoResponse::from).collect(Collectors.toList());
    }

    public List<TodoResponse> getByUser(Long userId) {
        return todoRepo.findTodoByUserId(userId).stream().map(TodoResponse::from).collect(Collectors.toList());
    }

    public void save(TodoRequest request) {
        Todo todo = new Todo();

        todo.setDescription(request.getDescription());
        todo.setName(request.getName());
        User user = userRepo.findById(request.getUserId()).orElse(null);
        todo.setUser(user);

        todoRepo.save(todo);
    }
}
