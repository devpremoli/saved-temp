package com.example.user_registration.repository;

import com.example.user_registration.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // No need to add methods, basic CRUD operations are provided by JpaRepository

}
