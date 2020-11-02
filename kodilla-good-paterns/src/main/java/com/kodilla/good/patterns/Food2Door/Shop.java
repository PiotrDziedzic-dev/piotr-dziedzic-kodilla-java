package com.kodilla.good.patterns.Food2Door;

public class Shop {

    private String name;
    private Product ourProduct;

    public Shop(String name, Product ourProduct){
        this.name = name;
        this.ourProduct = ourProduct;
    }

    public String getName() {
        return name;
    }

    public Product getOurProduct() {
        return ourProduct;
    }

    public boolean process() {
        System.out.println("Ok we will send you "+ourProduct.getAmountInKilograms()+" kg of "+ourProduct.getName());
        return true;
    }
}
