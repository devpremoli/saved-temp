package com.example.login_form.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/user")
    public String user() {
        return "user";  // Return the user.html view
    }
}
