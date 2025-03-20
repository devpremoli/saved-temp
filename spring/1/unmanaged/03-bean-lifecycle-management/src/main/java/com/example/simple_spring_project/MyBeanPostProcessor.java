package com.example.simple_spring_project;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    
    @Override
    public Object postProcessBeforeInitialization(@NonNull Object bean, @NonNull String beanName) throws BeansException {
        if (bean instanceof MyApplication) {
            System.out.println("BeanPostProcessor: Before Initialization of MyApplication (postProcessBeforeInitialization)");
        } else if (bean instanceof EmailService) {
            System.out.println("BeanPostProcessor: Before Initialization of EmailService (postProcessBeforeInitialization)");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(@NonNull Object bean, @NonNull String beanName) throws BeansException {
        if (bean instanceof MyApplication) {
            System.out.println("BeanPostProcessor: After Initialization of MyApplication (postProcessAfterInitialization)");
        } else if (bean instanceof EmailService) {
            System.out.println("BeanPostProcessor: After Initialization of EmailService (postProcessAfterInitialization)");
        }
        return bean;
    }
}
