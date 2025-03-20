package com.example.aop_demo.controller;

import com.example.aop_demo.model.User;
import com.example.aop_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {
        userService.registerUser(user);
        return "User registered successfully!";
    }

    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }
}
