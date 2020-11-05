package com.kodilla.good.patterns.food2Door;

public class FoodOrderService {

    private InformationService informationService;
    private Process process;

    public FoodOrderService(InformationService informationService, Process process) {
        this.informationService = informationService;
        this.process = process;

    }
    public boolean makeOrder(Shop shop,Order order) {
        informationService.inform(order);
        if(process.process(shop,order)) {
            System.out.println("Order has been procesed correctly");
        } else {
            System.out.println("We couldn't realizate order");
        }
        return true;
    }
}
