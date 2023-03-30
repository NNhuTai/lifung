package com.example.lifung.services;

import com.example.lifung.models.Todo;
import com.example.lifung.models.User;
import com.example.lifung.models.UserData;
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
public class UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private TodoRepo todoRepo;

    public List<UserData> getListUser() {
        return userRepo.findAll().stream().map(UserData::from).collect(Collectors.toList());
    }

    public UserData insertUser(UserData userData) {
        User user = new User();
        user.setName(userData.getName());
        userRepo.save(user);
        return UserData.from(user);
    }

    public void delete(Long id) {
        List<Todo> todoList = todoRepo.findTodoByUserId(id);
        if(todoList.size() > 0) {
            todoList.forEach(todo -> todo.setUser(null));
            todoRepo.saveAll(todoList);
        }
        userRepo.deleteById(id);
    }
}
