package com.example.bmicalculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testCalculateBMI() {
        App calculator = new App();
        double bmi = calculator.calculateBMI(70, 1.75);
        assertEquals(22.86, bmi, 0.01);
    }

    @Test
    public void testCalculateBMIInvalidHeight() {
        App calculator = new App();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculateBMI(70, 0);
        });
        assertEquals("Height must be greater than zero", exception.getMessage());
    }

    @Test
    public void testGetBMICategory() {
        App calculator = new App();

        assertEquals("Underweight", calculator.getBMICategory(17.5));
        assertEquals("Normal weight", calculator.getBMICategory(22.0));
        assertEquals("Overweight", calculator.getBMICategory(27.0));
        assertEquals("Obesity", calculator.getBMICategory(31.0));
    }
}
