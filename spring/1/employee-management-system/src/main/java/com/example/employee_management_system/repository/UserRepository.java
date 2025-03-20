package com.example.employee_management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.employee_management_system.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
