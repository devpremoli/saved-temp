package com.example.bookstore.bookstore_management_system.controller;


import com.example.bookstore.bookstore_management_system.model.Customer;
import com.example.bookstore.bookstore_management_system.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public String getAllCustomers(Model model) {
        List<Customer> books = customerService.getAllCustomers();
        model.addAttribute("customers", books);
        return "customers/list";
    }

    @GetMapping("/{id}")
    public String getCustomerById(@PathVariable Long id, Model model) {
        Customer customer = customerService.getCustomerById(id).orElseThrow(() -> new RuntimeException("Book not found"));
        model.addAttribute("customer", customer);
        return "customers/view";
    }

    @GetMapping("/new")
    public String showCreateCustomerForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "customers/create";
    }

    @PostMapping
    public String createCustomer(@ModelAttribute Customer customer) {
        customerService.createCustomer(customer);
        return "redirect:/customers";
    }

    @GetMapping("/{id}/edit")
    public String showEditCustomerForm(@PathVariable Long id, Model model) {
        Customer customer = customerService.getCustomerById(id).orElseThrow(() -> new RuntimeException("Book not found"));
        model.addAttribute("customer", customer);
        return "customers/edit";
    }

    @PostMapping("/{id}")
    public String updateBook(@PathVariable Long id, @ModelAttribute Customer customerDetails) {
        customerService.updateCustomer(id, customerDetails);
        return "redirect:/books";
    }

    @PostMapping("/{id}/delete")
    public String deleteBook(@PathVariable Long id) {
        customerService.deleteCustomer(id);
        return "redirect:/books";
    }
}
