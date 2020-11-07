package com.kodilla.good.patterns.food2Door;

public class FoodOrderService {

    private InformationService informationService;
    private Processor processor;

    public FoodOrderService(InformationService informationService, Processor processor) {
        this.informationService = informationService;
        this.processor = processor;

    }
    public boolean makeOrder(Order order,Shop shop) {
        informationService.inform(order,shop);
        if(processor.process()) {
            informationService.orderCorrect();
        } else {
            informationService.orderIncorrect();
        }
        return true;
    }
}
