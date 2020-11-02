package com.kodilla.good.patterns.challenges;

import java.time.*;

public class Application {

    public static void main(String[] args) {

        ServiceMaker serviceMaker = new ServiceMaker();
        Informator informator = new Informator();
        RepositoryMaker repositoryMaker = new RepositoryMaker();
        User user = new User("Jan","Kowalski");
        LocalDate from = LocalDate.of(2020,11,2);
        LocalDate to = LocalDate.of(2021,1,1);
        OrderRequest orderRequest = new OrderRequest(user,from,to);


        ProductOrderService productOrderService = new ProductOrderService(informator,serviceMaker,repositoryMaker);
        productOrderService.process(orderRequest);
    }
}
