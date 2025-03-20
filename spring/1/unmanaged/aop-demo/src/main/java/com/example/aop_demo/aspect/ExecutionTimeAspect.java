package com.example.aop_demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExecutionTimeAspect {

    // Define the pointcut for all methods in UserService
    @Pointcut("execution(* com.example.aop_demo.service.UserService.*(..))")
    public void userServiceMethods() {}

    // Around advice to calculate execution time of methods
    @Around("userServiceMethods()")
    public Object calculateExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();

        // Proceed with the method execution
        Object result = joinPoint.proceed();

        long end = System.currentTimeMillis();
        long executionTime = end - start;

        System.out.println(joinPoint.getSignature() + " executed in " + executionTime + "ms");

        return result;  // Return the original method's result
    }
}
