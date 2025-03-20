package com.example.simple_spring_project;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
    public SingletonBean() {
        System.out.println("SingletonBean Constructor: A new instance is created");
    }
    public String getMessage() {
        return "I am Singleton Bean";
    }
}
