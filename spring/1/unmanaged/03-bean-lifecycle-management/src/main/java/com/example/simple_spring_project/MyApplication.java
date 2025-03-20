package com.example.simple_spring_project;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // This will register this class as a Spring Bean
public class MyApplication {
    private final EmailService emailService;

    @Autowired // Constructor-based Dependency Injection (preferred in modern Spring)
    public MyApplication(EmailService emailService) {
        System.out.println("MyApplication constructor: " + this.getClass().getSimpleName());
        this.emailService = emailService;
    }

    public void processMessage() {
        System.out.println(emailService.getMessage());
    }

    // This method will be called after the bean is created and dependencies are injected

    @PostConstruct
    public void init() {
        System.out.println("MyApplication PostConstruct: Bean has been initialized");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("MyApplication PreDestroy: Cleanup before bean is destroyed");
    }
}
