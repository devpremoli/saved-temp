package com.example.simple_spring_project;

import org.springframework.stereotype.Service;

@Service // This will register this class as a Spring Bean
public class EmailService implements MessageService{
    @Override
    public String getMessage() {
        return "Hello from Email Service";
    }

}
