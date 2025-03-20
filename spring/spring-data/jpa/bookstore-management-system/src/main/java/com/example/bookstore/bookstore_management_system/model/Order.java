package com.example.bookstore.bookstore_management_system.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "orders") // Custom table name, since "order" is a reserved keyword
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")  // Custom column name
    private Long id;

    @Temporal(TemporalType.DATE)
    @Column(name = "order_date", nullable = false)
    private LocalDate orderDate;

    @Column(name = "total_amount", nullable = false)
    private double totalAmount;

    @ManyToOne
    @JoinColumn(name = "customer_id")  // Custom foreign key column name
    private Customer customer;

    @ManyToMany
    @JoinTable(
            name = "order_books",  // Custom join table name
            joinColumns = @JoinColumn(name = "order_id"),  // Custom foreign key for the Order
            inverseJoinColumns = @JoinColumn(name = "book_id")  // Custom foreign key for the Book
    )
    private Set<Book> books;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
