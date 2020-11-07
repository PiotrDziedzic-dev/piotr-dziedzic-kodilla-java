package com.kodilla.good.patterns.food2Door;

import java.util.List;

public class ExtraFoodShop extends Shop implements Processor {

    private String name;
    private List<Product> ourProducts;
    private Order order;

    public ExtraFoodShop(String name, List<Product> ourProducts,Order order) {
        super(name, ourProducts);
        this.order = order;
    }

    public boolean process() {

        if(ourProducts.contains(order.getProduct())) {
            System.out.println("We are sending you" + order.getProduct().getAmount() + "of" + order.getProduct());
            return true;
        } else {
            return false;
        }
    }

}
