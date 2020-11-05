package com.kodilla.good.patterns.food2Door;

public interface InformationService {

    default void inform(Order order){
        System.out.println("Shop: "+order.getShopName()+" offers "+order.getProduct().getAmount()+" of "+order.getProduct().getName());
    }

}
