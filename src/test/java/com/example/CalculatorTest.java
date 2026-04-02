package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for Calculator class
 */
public class CalculatorTest {
    
    private Calculator calculator = new Calculator();
    
    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(-5, 5));
    }
    
    @Test
    public void testSubtract() {
        assertEquals(1, calculator.subtract(5, 4));
        assertEquals(-10, calculator.subtract(0, 10));
    }
    
    @Test
    public void testMultiply() {
        assertEquals(12, calculator.multiply(3, 4));
        assertEquals(0, calculator.multiply(5, 0));
    }
    
    @Test
    public void testDivide() {
        assertEquals(2, calculator.divide(10, 5));
        assertEquals(1, calculator.divide(5, 5));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculator.divide(10, 0);
    }
}
