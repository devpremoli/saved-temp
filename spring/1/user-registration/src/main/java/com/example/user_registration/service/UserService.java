package com.example.user_registration.service;

import com.example.user_registration.model.User;
import com.example.user_registration.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    // Step 3: Process the data received from the Presentation Layer
    // The controller passes the User object to this method
    public void saveUser(User user) { // Method to save a user
        // Step 4: Any business logic would be applied here
        // For example, you might check if the user already exists, validate the password, etc.

        // Step 5: Persist the processed data into the database using the Data Access Layer
        userRepository.save(user);
    }

    // Method to find a user by their ID
    public User findUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    // Method to find all users
    public Iterable<User> findAllUsers() {
        return userRepository.findAll();
    }

    // Method to delete a user by ID
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }
}
