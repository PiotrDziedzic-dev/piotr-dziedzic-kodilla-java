package com.kodilla.good.patterns.food2Door;

import java.util.ArrayList;
import java.util.List;

public class DataCreator {
    private List<Product> shop1List = new ArrayList<>();
    private List<Product> shop2List = new ArrayList<>();
    private List<Product> shop3List = new ArrayList<>();

        public DataCreator() {
            Product product1 = new Product("Apple", 100);
            Product product2 = new Product("Banana", 100);
            Product product3 = new Product("Orange", 100);
            Product product4 = new Product("Cherry", 100);
            Product product5 = new Product("Strawberry", 100);
            Product product6 = new Product("Raspberry", 100);
            Product product7 = new Product("Pasionfruit", 100);
            Product product8 = new Product("Dragonfruit", 100);
            Product product9 = new Product("Kiwi", 100);

            shop1List.add(product1);
            shop1List.add(product2);
            shop1List.add(product3);

            shop2List.add(product4);
            shop2List.add(product5);
            shop2List.add(product6);

            shop3List.add(product7);
            shop3List.add(product8);
            shop3List.add(product9);
        }

    public List<Product> getShop1List() {
        return shop1List;
    }

    public List<Product> getShop2List() {
        return shop2List;
    }


    public List<Product> getShop3List() {
        return shop3List;
    }
}

