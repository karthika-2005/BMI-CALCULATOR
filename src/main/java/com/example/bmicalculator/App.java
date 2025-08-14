package com.example.bmicalculator;

public class App {

    /**
     * Calculate BMI given weight (kg) and height (meters)
     */
    public double calculateBMI(double weightKg, double heightMeters) {
        if (heightMeters <= 0) {
            throw new IllegalArgumentException("Height must be greater than zero");
        }
        return weightKg / (heightMeters * heightMeters);
    }

    /**
     * Get BMI category based on BMI value
     */
    public String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25.0) {
            return "Normal weight";
        } else if (bmi < 30.0) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }

    // Optional main method to test from command line
    public static void main(String[] args) {
        App calculator = new App();
        double bmi = calculator.calculateBMI(70, 1.75);
        System.out.println("BMI: " + bmi);
        System.out.println("Category: " + calculator.getBMICategory(bmi));
    }
}
