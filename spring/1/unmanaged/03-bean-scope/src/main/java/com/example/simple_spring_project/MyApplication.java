package com.example.simple_spring_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // This will register this class as a Spring Bean
public class MyApplication {
    private final PrototypeBean prototypeBean1;
    private final PrototypeBean prototypeBean2;
    private final SingletonBean singletonBean1;
    private final SingletonBean singletonBean2;

    @Autowired // Constructor-based Dependency Injection (preferred in modern Spring)
    public MyApplication(PrototypeBean prototypeBean1, PrototypeBean prototypeBean2, SingletonBean singletonBean1, SingletonBean singletonBean2) {
        System.out.println("MyApplication constructor: " + this.getClass().getSimpleName());
        this.prototypeBean1 = prototypeBean1;
        this.prototypeBean2 = prototypeBean2;
        this.singletonBean1 = singletonBean1;
        this.singletonBean2 = singletonBean2;
    }

    public void processMessage() {
        System.out.println(prototypeBean1.getMessage());
        System.out.println(prototypeBean2.getMessage());
    }

    public boolean arePrototypeBeanSame() {
        return prototypeBean1 == prototypeBean2;
    }

    public boolean areSingletonBeanSame() {
        return singletonBean1 == singletonBean2;
    }
}
