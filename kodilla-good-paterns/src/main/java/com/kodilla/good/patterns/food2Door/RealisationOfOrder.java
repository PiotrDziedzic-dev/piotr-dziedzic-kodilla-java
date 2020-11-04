package com.kodilla.good.patterns.food2Door;

public interface RealisationOfOrder {

    default void realisation(Shop shop){
        shop.process();
    }

}
