package com.example.user_management.service;

import com.example.user_management.repository.UserRepository;
import com.example.user_management.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    public User createUser(User user) {
        logger.info("createUser method called - Business Logic");
        logger.info("Received User Details: firstName={}, lastName={}, age={}", user.getFirstName(), user.getLastName(), user.getAge());
        User savedUser = userRepository.save(user);
        logger.info("User created with ID={}", savedUser.getId());
        return savedUser;
    }

    public List<User> getAllUsers() {
        List<User> users = userRepository.findAll();
        logger.info("Retrieved {} users from database", users.size());
        return users;
    }

    public Optional<User> getUserById(Long id) {
        logger.info("getUserById method called for ID={}", id);
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            logger.info("User found with ID={}", id);
        } else {
            logger.warn("No user found with ID={}", id);
        }
        return user;
    }

    public User updateUser(Long id, User user) {
        logger.info("updateUser method called for ID={}", id);
        return userRepository.findById(id)
                .map(existingUser -> {
                    logger.info("Updating user with ID={}", id);
                    existingUser.setFirstName(user.getFirstName());
                    existingUser.setLastName(user.getLastName());
                    existingUser.setAge(user.getAge());
                    User updatedUser = userRepository.save(existingUser);
                    logger.info("User updated with ID={}", updatedUser.getId());
                    return updatedUser;
                })
                .orElseThrow(() -> {
                    logger.error("User with ID={} not found, update failed", id);
                    return new RuntimeException("User not found");
                });
    }

    public void deleteUser(Long id) {
        logger.info("deleteUser method called for ID={}", id);
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            logger.info("User deleted with ID={}", id);
        } else {
            logger.warn("User with ID={} not found, delete operation failed", id);
        }
    }
}
