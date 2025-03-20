package com.example.user_registration.controller;

import com.example.user_registration.model.User;
import com.example.user_registration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    // Handle GET request for showing the registration form
    @GetMapping("/register")
    public String showRegistrationForm() {
        return "register"; // Returns the Thymeleaf view name
    }

    // Handle POST Request for form submission
    @PostMapping("/register")
    public String registerUser(@RequestParam String username,
                               @RequestParam String password,
                               Model model
                               ) {


        // Step 1: Controller receives the form data from the Presentation Layer
        User user = new User(username, password); // Create a new User object

        // Step 2: Delegate data processing to the Business Layer (UserService)
        userService.saveUser(user); // Save the user using the UserService

        model.addAttribute("username", username); // Passing data to the view
        //model.addAttribute("password", password);
        return "success";
    }
}
