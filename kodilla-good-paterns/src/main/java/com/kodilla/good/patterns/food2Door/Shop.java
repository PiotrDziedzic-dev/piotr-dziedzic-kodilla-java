package com.kodilla.good.patterns.food2Door;

import java.util.List;

public class Shop {

    private String name;
    private List<Product> ourProducts;

    public Shop(String name, List<Product> ourProducts){
        this.name = name;
        this.ourProducts = ourProducts;
    }

    public String getName() {
        return name;
    }

    public List<Product> getOurProducts() {
        return ourProducts;
    }

}
