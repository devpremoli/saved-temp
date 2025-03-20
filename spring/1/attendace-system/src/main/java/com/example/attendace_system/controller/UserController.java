package com.example.attendace_system.controller;

import com.example.attendace_system.entity.User;
import com.example.attendace_system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String redirectToLogin() {
        return "redirect:/login";
    }

    // Show registration form
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());  // Empty user object for form binding
        return "register";  // Thymeleaf template for registration
    }

    // Handle user registration form submission
    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") User user, Model model) {
        try {
            // Attempt to register the user
            userService.registerUser(user.getUsername(), user.getPassword(), user.getFirstName(), user.getLastName());

            // Add a success message to the model
            model.addAttribute("successMessage", "Registration successful! Please log in.");

            return "redirect:/login";  // Redirect to log in after successful registration
        } catch (Exception e) {
            // Handle exceptions (e.g., duplicate username)
            model.addAttribute("errorMessage", "Registration failed: " + e.getMessage());

            // Return to the registration page with the error message
            return "register";
        }
    }

    // Show login form
    @GetMapping("/login")
    public String showLoginForm() {
        return "login";  // Thymeleaf template for login
    }
}
