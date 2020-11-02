package com.kodilla.good.patterns.Food2Door;


public class Product {

    private String name;
    private int amountInKilograms;

    public Product(String name, int amountInKilograms) {
        this.name = name;
        this.amountInKilograms = amountInKilograms;
    }

    public String getName() {
        return name;
    }

    public int getAmountInKilograms() {
        return amountInKilograms;
    }
}
