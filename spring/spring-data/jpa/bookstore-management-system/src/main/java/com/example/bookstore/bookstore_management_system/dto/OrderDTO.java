package com.example.bookstore.bookstore_management_system.dto;

import java.util.Set;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;

public class OrderDTO {

    private Long customerId;
    private Set<Long> bookIds;

    private LocalDate orderDate;
    private double totalAmount;

    // Getters and Setters
    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public Set<Long> getBookIds() {
        return bookIds;
    }

    public void setBookIds(Set<Long> bookIds) {
        this.bookIds = bookIds;
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
}
