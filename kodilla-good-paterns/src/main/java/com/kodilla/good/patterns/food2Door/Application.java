package com.kodilla.good.patterns.food2Door;

public class Application {

    public static void main(String[] args) {

        DataCreator dataCreator = new DataCreator();
        Order order1 = new Order(dataCreator.getShop1List().get(1));
        Order order2 = new Order(dataCreator.getShop2List().get(1));
        Order order3 = new Order(dataCreator.getShop3List().get(1));
        ExtraFoodShop extraFoodShop = new ExtraFoodShop("ExtraFoodShop",dataCreator.getShop1List(),order1);
        HealthyShop healthyShop = new HealthyShop("HealthyShop",dataCreator.getShop2List(),order2);
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop("GlutenFreeShop",dataCreator.getShop3List(),order3);
        Informator informator1 = new Informator();
        FoodOrderService foodOrderService1 = new FoodOrderService(informator1,extraFoodShop);
        FoodOrderService foodOrderService2 = new FoodOrderService(informator1,healthyShop);
        FoodOrderService foodOrderService3 = new FoodOrderService(informator1,glutenFreeShop);
        foodOrderService1.makeOrder(order1,extraFoodShop);
        foodOrderService2.makeOrder(order2,healthyShop);
        foodOrderService3.makeOrder(order3,glutenFreeShop);

    }
}
