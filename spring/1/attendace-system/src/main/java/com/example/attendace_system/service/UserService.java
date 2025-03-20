package com.example.attendace_system.service;

import com.example.attendace_system.entity.User;
import com.example.attendace_system.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;


    @Autowired
    public UserService(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    // Find user by username (used in the AttendanceController)
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    // Register a new user (used in the UserController)
    public User registerUser(String username, String rawPassword, String firstName, String lastName) {
        // Hash the password before saving the user
        String hashedPassword = passwordEncoder.encode(rawPassword);

        // Create new user and save to the database
        User user = new User(username, hashedPassword, firstName, lastName);
        return userRepository.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> optionalUser = Optional.ofNullable(userRepository.findByUsername(username));

        // Check if user exists, otherwise throw exception
        if (optionalUser.isEmpty()) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }

        User foundUser = optionalUser.get();

        // Return Spring Security UserDetails object
        return org.springframework.security.core.userdetails.User.builder()
                .username(foundUser.getUsername())
                .password(foundUser.getPassword())
                .roles("USER") // You can manage roles as per your logic
                .build();
    }
}
