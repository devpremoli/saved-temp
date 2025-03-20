package com.example.form_based_login.repository;

import com.example.form_based_login.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository  extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
