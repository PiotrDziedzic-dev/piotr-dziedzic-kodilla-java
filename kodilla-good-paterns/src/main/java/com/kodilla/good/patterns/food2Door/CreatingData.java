package com.kodilla.good.patterns.food2Door;

import java.util.ArrayList;
import java.util.List;

public class CreatingData {
    List<Product> shop1List = new ArrayList<>();
    List<Product> shop2List = new ArrayList<>();

        public CreatingData() {
            Product product1 = new Product("Apple", 100);
            Product product2 = new Product("Banana", 100);
            Product product3 = new Product("Orange", 100);
            Product product4 = new Product("Cherry", 100);
            Product product5 = new Product("Strawberry", 100);
            Product product6 = new Product("Raspberry", 100);

            shop1List.add(product1);
            shop1List.add(product2);
            shop1List.add(product3);

            shop2List.add(product4);
            shop2List.add(product5);
            shop2List.add(product6);
        }

    public List<Product> getShop1List() {
        return shop1List;
    }

    public List<Product> getShop2List() {
        return shop2List;
    }
}

