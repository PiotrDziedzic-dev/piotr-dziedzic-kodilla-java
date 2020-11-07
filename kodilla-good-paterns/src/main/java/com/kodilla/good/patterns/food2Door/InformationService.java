package com.kodilla.good.patterns.food2Door;

public interface InformationService {

    default void inform(Order order,Shop shop){
        System.out.println("Shop: "+shop.getName()+" offers "+order.getProduct().getAmount()+" of "+order.getProduct().getName());
    }
    default void orderCorrect(){
        System.out.println("Order has been procesed correctly");
    }
    default void orderIncorrect(){
        System.out.println("We couldn't realized order");
    }

}
