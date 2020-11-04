package com.kodilla.good.patterns.Food2Door;

public class Application {

    public static void main(String[] args) {

        Product product1 = new Product("Apple",100);
        Shop shop1 = new Shop("Biedronka",product1);
        PropositionOfDeal propositionOfDeal = new PropositionOfDeal(shop1);
        Checker checker = new Checker();
        Informator informator = new Informator();
        Realisator realisator = new Realisator();
        FoodOrderService foodOrderService = new FoodOrderService(informator,realisator,checker);
        foodOrderService.addShopWhichDeliversFood(propositionOfDeal);
    }
}
