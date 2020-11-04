package com.kodilla.good.patterns.food2Door;

public interface CheckingOfOrder {

    default void Checking(Shop shop){

        boolean isDone = shop.process();

        if(isDone){
            System.out.println("The order has been processed correctly");
        }

    }
}
