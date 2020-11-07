package com.kodilla.good.patterns.food2Door;

public class Order {
    private Product product;

    public Order(Product product){
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }
}
