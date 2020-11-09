package com.kodilla.good.patterns.food2Door;

import java.util.LinkedList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        DataCreator dataCreator = new DataCreator();
        Order order1 = new Order(new Product("Apple",100),new Product("Orange",100));
        Order order2 = new Order(new Product("Cherry",100),new Product("Strawberry",100));
        Order order3 = new Order(new Product("Chips",200));
        ExtraFoodShop extraFoodShop = new ExtraFoodShop("ExtraFoodShop",dataCreator.getShop1List());
        HealthyShop healthyShop = new HealthyShop("HealthyShop",dataCreator.getShop2List());
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop("GlutenFreeShop",dataCreator.getShop3List());
        Informator informator1 = new Informator();
        FoodOrderService foodOrderService = new FoodOrderService(informator1);
        foodOrderService.makeOrder(order1,extraFoodShop);
        foodOrderService.makeOrder(order2,healthyShop);
        foodOrderService.makeOrder(order3,glutenFreeShop);

    }
}
