package com.example.spring_mvc_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/welcome")
    public String welcome(Model model) {
        model.addAttribute("message", "Welcome to Spring MVC!");
        return "welcome"; // This maps to welcome.html in templates folder
    }
}
