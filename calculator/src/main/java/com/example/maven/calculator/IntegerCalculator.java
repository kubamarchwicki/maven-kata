package com.example.maven.calculator;

public class IntegerCalculator implements Calculator<Integer> {

    @Override
    public Integer sum(Integer summand1, Integer summand2) {
        return summand1 + summand2;
    }

    @Override
    public Integer difference(Integer minuend, Integer subtrahend) {
        return minuend - subtrahend;
    }

    @Override
    public Integer product(Integer multiplicand1, Integer multiplicand2) {
        return multiplicand1 * multiplicand2;
    }

    @Override
    public Double quotient(Integer dividend, Integer divisor) {
        return dividend.doubleValue() / divisor.doubleValue();
    }
}
