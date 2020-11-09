package com.kodilla.good.patterns.food2Door;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Order {

    private List<Product> products = new ArrayList<>();

    public Order(Product...product) {
        Collections.addAll(products, product);
    }

    public List<Product> getProducts() {
        return products;
    }
}
