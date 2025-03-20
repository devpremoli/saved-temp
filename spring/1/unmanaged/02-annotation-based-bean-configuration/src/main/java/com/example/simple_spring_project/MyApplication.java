package com.example.simple_spring_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // This will register this class as a Spring Bean
public class MyApplication {
    private MessageService messageService;
    // Setter-based Dependency Injection

    @Autowired // Constructor-based Dependency Injection (preferred in modern Spring)
    public MyApplication(MessageService messageService) {
        System.out.println("MyApplication constructor: " + this.getClass().getSimpleName());
        this.messageService = messageService;
    }

    public void processMessage() {
        System.out.println(messageService.getMessage());
    }
}
