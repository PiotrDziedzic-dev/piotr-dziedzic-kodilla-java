package com.kodilla.good.patterns.food2Door;

public interface Process {

    default boolean process(Shop shop, Order order) {

        System.out.println("We are realizating order");
        if(shop.getOurProducts().contains(order.getProduct())) {
            return true;
        } else {
            return false;
        }

    }
}
