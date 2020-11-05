package com.kodilla.good.patterns.food2Door;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        CreatingData creatingData = new CreatingData();
        Shop shop1 = new Shop("Biedronka",creatingData.shop1List);
        Shop shop2 = new Shop("Lidl",creatingData.shop2List);
        Order order1 = new Order(shop1.getName(),shop1.getOurProducts().get(1));
        Order order2 = new Order(shop2.getName(),shop2.getOurProducts().get(1));
        Processor processor1 = new Processor();
        Informator informator1 = new Informator();
        FoodOrderService foodOrderService = new FoodOrderService(informator1,processor1);
        foodOrderService.makeOrder(shop1,order1);
        foodOrderService.makeOrder(shop2,order2);
    }
}
