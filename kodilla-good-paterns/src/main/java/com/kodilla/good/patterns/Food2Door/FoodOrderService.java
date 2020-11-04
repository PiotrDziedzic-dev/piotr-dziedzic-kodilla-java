package com.kodilla.good.patterns.Food2Door;

public class FoodOrderService {

    private InformationsAboutShop informationsAboutShop;
    private RealisationOfOrder realisationOfOrder;
    private CheckingOfOrder checkingOfOrder;

    public FoodOrderService(InformationsAboutShop informationsAboutShop,RealisationOfOrder realisationOfOrder,CheckingOfOrder checkingOfOrder) {
        this.informationsAboutShop = informationsAboutShop;
        this.realisationOfOrder = realisationOfOrder;
        this.checkingOfOrder = checkingOfOrder;

    }
    public void addShopWhichDeliversFood(PropositionOfDeal propositionOfDeal) {
        informationsAboutShop.inform(propositionOfDeal.getShop());
        realisationOfOrder.realisation(propositionOfDeal.getShop());
        checkingOfOrder.Checking(propositionOfDeal.getShop());
    }
}
