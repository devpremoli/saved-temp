package org.example.concepts.ejb.sessionbean.stateless.calculator;

import jakarta.ejb.Stateless;

@Stateless
public class CalculatorBeanImpl implements CalculatorBean {


    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }
}
