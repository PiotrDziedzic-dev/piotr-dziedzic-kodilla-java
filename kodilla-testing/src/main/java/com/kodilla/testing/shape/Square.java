package com.kodilla.testing.shape;

public class Square implements Shape {
    private String shape;
    private int lengthOfSide;

    public Square (String shape, int lengthOfSide) {
        this.shape = shape;
        this.lengthOfSide = lengthOfSide;
    }
    public String getShapeName() {
        return shape;
    }
    public double getField() {
        return lengthOfSide*lengthOfSide;
    }
}
