package com.kodilla.testing.calculator;

public class Calculator {
    private int a,b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add() {
        return a+b;
    }

    public double subtract() {
        return a/b;
    }

}
