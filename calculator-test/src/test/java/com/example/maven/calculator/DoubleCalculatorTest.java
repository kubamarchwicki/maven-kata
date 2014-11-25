package com.example.maven.calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.reflections.Reflections;

import java.util.Set;

import static org.junit.Assert.assertEquals;

public class DoubleCalculatorTest {

    private static Calculator<Double> calculator;

    @BeforeClass
    public static void setup() throws IllegalAccessException, InstantiationException {
        Reflections reflections = new Reflections("com.example.maven.calculator");
        Set<Class<? extends Calculator>> subTypesOf = reflections.getSubTypesOf(Calculator.class);
        for (Class<? extends Calculator> c: subTypesOf) {
            calculator = (Calculator<Double>) c.newInstance();
        }
    }

    @Test
    public void shouldAddTwoDoubleNumbers() {
        assertEquals(Double.valueOf("5"),
                calculator.sum(Double.valueOf("2"), Double.valueOf("3")));
    }

}
