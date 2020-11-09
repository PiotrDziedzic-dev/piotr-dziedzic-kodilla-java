package com.kodilla.good.patterns.food2Door;

public class FoodOrderService {

    private InformationService informationService;

    public FoodOrderService(InformationService informationService) {
        this.informationService = informationService;

    }
    public void makeOrder(Order order,Shop shop) {
        informationService.inform(order,shop);
        if(shop.process(order)) {
            informationService.orderCorrect();
        } else {
            informationService.orderIncorrect();
        }
        System.out.println();
    }
}
