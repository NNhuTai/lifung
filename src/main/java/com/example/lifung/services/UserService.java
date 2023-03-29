package com.example.lifung.services;

import com.example.lifung.models.User;
import com.example.lifung.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Tai Nguyen
 */
@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public List<User> getListUser() {
        return userRepo.findAll();
    }
}
