package com.kodilla.testing.shape;

public class Triangle implements Shape{
    private String shape;
    private int height;
    private int lengthOfBasis;

    public Triangle(String shape, int height, int lengthOfBasis) {
        this.height = height;
        this.shape = shape;
        this.lengthOfBasis = lengthOfBasis;
    }

    public String getShapeName() {
        return shape;
    }
    public double getField() {
        return (height*lengthOfBasis)/2;
    }
}
