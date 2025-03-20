package com.example.aop_demo.service;

import com.example.aop_demo.model.User;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final List<User> users = new ArrayList<>();

    public void registerUser(User user) {
        users.add(user);
        System.out.println("User registered: " + user.getUsername());
    }

    public List<User> getUsers() {
        return users;
    }
}
