package com.example.bookstore.bookstore_management_system.service;

import com.example.bookstore.bookstore_management_system.model.Order;
import com.example.bookstore.bookstore_management_system.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    // Fetch all orders
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    // Create a new order
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    // Find an order by ID
    public Optional<Order> getOrderById(Long id) {
        return orderRepository.findById(id);
    }

    // Update an order
    public Order updateOrder(Order order) {
        return orderRepository.save(order);
    }

    // Delete an order by ID
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
