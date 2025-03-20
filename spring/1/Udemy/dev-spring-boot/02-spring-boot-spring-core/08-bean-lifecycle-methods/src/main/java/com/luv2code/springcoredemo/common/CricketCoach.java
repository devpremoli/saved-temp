package com.luv2code.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    public CricketCoach() {
        System.out.println("In Constructor " + this.getClass().getSimpleName());
    }

    // define init method
    @PostConstruct
    public void doMyStartupStuff() { // can be other method name
        System.out.println("In doMyStartupStuff method " + this.getClass().getSimpleName());
    }

    // define destroy method
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println("In destroy method " + this.getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes :-)";
    }
}
