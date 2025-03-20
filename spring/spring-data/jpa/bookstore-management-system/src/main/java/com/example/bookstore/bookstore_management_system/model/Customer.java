package com.example.bookstore.bookstore_management_system.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")  // Custom column name
    private Long id;

    @Column(name = "first_name", nullable = false)  // Custom column name and nullable constraint
    private String firstName;

    @Column(name = "last_name", nullable = false)  // Custom column name and nullable constraint
    private String lastName;

    @Column(name = "email_address", nullable = false, unique = true)  // Custom column name and unique constraint
    private String email;

    @Column(name = "customer_address")  // Custom column name
    private String address;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Order> orders;

    //public Customer() {}
    //public Customer(String firstName, String lastName, String email, String address) {}

    // Getters and Setters

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public List<Order> getOrders() {
        return orders;
    }
    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
