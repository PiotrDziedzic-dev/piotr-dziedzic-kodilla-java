package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private InformationService informationService;
    private OrderRepository orderRepository;
    private OrderService orderService;


    public ProductOrderService(InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
        this.orderService = orderService;
    }

    public OrderDto process(OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(),orderRequest.getFrom(),orderRequest.getTo());

        if(isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(),orderRequest.getFrom(),orderRequest.getTo());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }

    }

}
