package com.example.lifung.controllers;

import com.example.lifung.models.User;
import com.example.lifung.models.UserData;
import com.example.lifung.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Tai Nguyen
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/get")
    public List<UserData> getList() {
        return userService.getListUser();
    }

    @PostMapping("/create")
    public UserData createUser(@RequestBody UserData user) {
        return userService.insertUser(user);
    }
}
