package com.example.employee_management_system.controller;

import com.example.employee_management_system.service.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.employee_management_system.model.User;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {
    private final CustomUserDetailsService customUserDetailsService;

    @Autowired
    public RegistrationController(CustomUserDetailsService customUserDetailsService) {
        this.customUserDetailsService = customUserDetailsService;
    }

    @GetMapping("/register")
    public String registerForm(Model model) {
        model.addAttribute("user", new User());
        return "register";  // registration form page
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user) {
        customUserDetailsService.saveUser(user);
        return "redirect:/login";  // redirect to login page after successful registration
    }

}
