package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String shape;
    private int radius;

    public Circle (String shape, int radius) {
        this.radius = radius;
        this.shape = shape;
    }

    public String getShapeName() {
        return shape;
    }
    public double getField() {
        return 3.14*radius*radius;
    }
}
