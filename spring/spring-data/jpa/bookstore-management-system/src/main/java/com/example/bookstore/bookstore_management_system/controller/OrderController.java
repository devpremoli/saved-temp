package com.example.bookstore.bookstore_management_system.controller;

import com.example.bookstore.bookstore_management_system.dto.OrderDTO;
import com.example.bookstore.bookstore_management_system.model.Book;
import com.example.bookstore.bookstore_management_system.model.Customer;
import com.example.bookstore.bookstore_management_system.model.Order;
import com.example.bookstore.bookstore_management_system.service.BookService;
import com.example.bookstore.bookstore_management_system.service.CustomerService;
import com.example.bookstore.bookstore_management_system.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Controller
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;
    private final CustomerService customerService;
    private final BookService bookService;

    @Autowired
    public OrderController(OrderService orderService, CustomerService customerService, BookService bookService) {
        this.orderService = orderService;
        this.customerService = customerService;
        this.bookService = bookService;
    }

    @GetMapping
    public String getAllOrders(Model model) {
        List<Order> orders = orderService.getAllOrders();
        model.addAttribute("orders", orders);
        return "orders/list";
    }

    @GetMapping("/new")
    public String showCreateOrderForm(Model model) {
        model.addAttribute("orderDTO", new OrderDTO());
        model.addAttribute("customers", customerService.getAllCustomers());
        model.addAttribute("books", bookService.getAllBooks());
        return "orders/create";
    }

    @PostMapping
    public String createOrder(@ModelAttribute OrderDTO orderDTO) {
        // Map OrderDTO to Order entity
        Order order = new Order();
        order.setOrderDate(orderDTO.getOrderDate());
        order.setTotalAmount(orderDTO.getTotalAmount());

        // Fetch the Customer entity based on customerId from the DTO
        Optional<Customer> optionalCustomer = customerService.getCustomerById(orderDTO.getCustomerId());
        Customer customer = optionalCustomer.orElseThrow(() -> new IllegalArgumentException("Customer not found with id: " + orderDTO.getCustomerId()));
        order.setCustomer(customer);

        // Fetch the Book entities based on bookIds from the DTO
        Set<Book> books = new HashSet<>();
        for (Long bookId : orderDTO.getBookIds()) {
            Optional<Book> optionalBook = bookService.getBookById(bookId);
            optionalBook.ifPresent(books::add);  // Add book if found
        }
        order.setBooks(books);

        // Save the Order
        orderService.createOrder(order);
        return "redirect:/orders";
    }

    @GetMapping("/{id}")
    public String getOrderById(@PathVariable("id") Long id, Model model) {
        Optional<Order> optionalOrder = orderService.getOrderById(id);
        if (optionalOrder.isPresent()) {
            Order order = optionalOrder.get();  // Get the actual Order object
            model.addAttribute("order", order);
            return "orders/view";  // Make sure this view exists to show the order details
        } else {
            return "error/404";  // Optionally handle the case where the order is not found
        }
    }
}
