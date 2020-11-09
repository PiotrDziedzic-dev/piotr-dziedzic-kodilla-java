package com.kodilla.good.patterns.food2Door;

import java.util.List;

public abstract class Shop {

    private String name;
    private List<Product> ourProducts;

    public Shop(String name, List<Product> ourProducts){
        this.name = name;
        this.ourProducts = ourProducts;
    }

    public boolean process(Order order) {
        for (Product p : order.getProducts()) {
            for (Product ourProduct : ourProducts) {
                if (p.getName().equals(ourProduct.getName()) && p.getAmount()<=ourProduct.getAmount()) {
                    ourProduct.decreaseAmount(p.getAmount());
                    return true;
                }
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public List<Product> getOurProducts() {
        return ourProducts;
    }

}
