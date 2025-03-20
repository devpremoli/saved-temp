package com.example.attendace_system.repository;

import com.example.attendace_system.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    // Custom query to find a user by their username
    User findByUsername(String username);
}
