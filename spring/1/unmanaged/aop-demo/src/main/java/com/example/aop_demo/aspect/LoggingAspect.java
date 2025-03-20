package com.example.aop_demo.aspect;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    // Define a pointcut for all methods in UserService
    @Pointcut("execution(* com.example.aop_demo.service.UserService.*(..))")
    public void userServiceMethods() {}

    // Log before method execution
    @Before("userServiceMethods()")
    public void logBefore() {
        System.out.println("Logging: Method execution started.");
    }

    // Log after method execution
    @After("userServiceMethods()")
    public void logAfter() {
        System.out.println("Logging: Method execution completed.");
    }
}
