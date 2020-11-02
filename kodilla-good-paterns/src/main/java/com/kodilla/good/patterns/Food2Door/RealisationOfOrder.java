package com.kodilla.good.patterns.Food2Door;

public interface RealisationOfOrder {

    default void realisation(Shop shop){
        shop.process();
    }

}
