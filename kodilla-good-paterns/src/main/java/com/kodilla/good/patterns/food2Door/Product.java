package com.kodilla.good.patterns.food2Door;


public class Product {

    private String name;
    private int amount;

    public Product(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public void decreaseAmount(int orderAmount) {
        amount = amount-orderAmount;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return name;
    }

}
