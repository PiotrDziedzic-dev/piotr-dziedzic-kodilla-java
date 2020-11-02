package com.kodilla.good.patterns.Food2Door;

public interface InformationsAboutShop {

    default void inform(Shop shop){
        System.out.println("Shop: "+shop.getName()+" offers "+shop.getOurProduct().getAmountInKilograms()+" kg "+" of "+shop.getOurProduct().getName());
    }

}
