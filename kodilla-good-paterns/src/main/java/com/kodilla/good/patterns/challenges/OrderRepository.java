package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface OrderRepository {

    default void createOrder(User user, LocalDate from, LocalDate to) {
        System.out.println("Adding order to the data base" + user.getName() + user.getSurname() + from.toString() + to.toString());
    }
}
