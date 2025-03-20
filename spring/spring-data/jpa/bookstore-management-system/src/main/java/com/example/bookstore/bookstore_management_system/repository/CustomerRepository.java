package com.example.bookstore.bookstore_management_system.repository;

import com.example.bookstore.bookstore_management_system.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<Customer, Long> {
}
