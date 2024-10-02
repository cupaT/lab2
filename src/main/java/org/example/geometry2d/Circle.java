package org.example.geometry2d;

public class Circle implements Figure {
    private double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("The radius must be a positive number.");
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle with radius " + radius;
    }
}
