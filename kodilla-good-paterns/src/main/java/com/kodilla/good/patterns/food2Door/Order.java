package com.kodilla.good.patterns.food2Door;

public class Order {
    private String shopName;
    private Product product;

    public Order(String shopName, Product product){
        this.shopName = shopName;
        this.product = product;
    }

    public String getShopName() {
        return shopName;
    }

    public Product getProduct() {
        return product;
    }
}
