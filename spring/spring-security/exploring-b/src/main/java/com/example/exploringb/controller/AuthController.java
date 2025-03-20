package com.example.exploringb.controller;

import com.example.exploringb.model.User;
import com.example.exploringb.service.AuthService;
import com.example.exploringb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/")
public class AuthController {

    private final UserService userService;
    private final AuthService authService;

    @Autowired
    public AuthController(UserService userService, AuthService authService) {
        this.userService = userService;
        this.authService = authService;
    }

    @GetMapping
    public String home() {
        // Redirect to /register instead of returning the home view
        return "redirect:/register";
    }

    @GetMapping("/home")
    public String showHome() {
        return "home";
    }

    @GetMapping("/register")
    public String showRegisterForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute User user) {
        userService.createUser(user);
        return "redirect:/login";
    }

//    @GetMapping("/login")
//    public String showLoginPage() {
//        return "login";  // Corresponds to login.html
//    }

    @GetMapping("/login")
    public String showLoginPage(@RequestParam(value = "error", required = false) String error, Model model) {
        if (error != null) {
            model.addAttribute("error", "Invalid username or password.");
        }
        return "login";  // Corresponds to login.html
    }

    @PostMapping("/login")
    public String loginUser(@RequestParam String username,
                            @RequestParam String password,
                            Model model) {
        try {
            // Authenticate user using AuthService
            UserDetails userDetails = authService.authenticate(username, password);
            model.addAttribute("user", userDetails);
            return "redirect:/home"; // Redirect to home on successful login
        } catch (Exception e) {
            model.addAttribute("error", true); // Indicate login failure
            return "login"; // Reload login page with error message
        }
    }

    // API-based login for REST clients
    @PostMapping("/auth")
    @ResponseBody
    public ResponseEntity<String> authenticateUser(@RequestBody User loginRequest) {
        try {
            UserDetails userDetails = authService.authenticate(loginRequest.getUsername(), loginRequest.getPassword());
            return ResponseEntity.ok("Authentication successful for user: " + userDetails.getUsername());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Authentication failed: Invalid credentials");
        }
    }
}
