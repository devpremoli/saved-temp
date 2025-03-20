package org.example.concepts.ejb.sessionbean.stateless.calculator;

import jakarta.ejb.Local;

@Local
public interface CalculatorBean {
    int add(int a, int b);
    int subtract(int a, int b);
}
