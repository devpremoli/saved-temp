package com.example.security_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String showLoginForm() {
        return "loginform";  // Name of the Thymeleaf template for the login page
    }
}
