package com.example.simple_spring_project;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeBean {
    public PrototypeBean() {
        System.out.println("PrototypeBean Constructor: A new instance is created");
    }
    public String getMessage() {
        return "I am Prototype Bean";
    }
}
