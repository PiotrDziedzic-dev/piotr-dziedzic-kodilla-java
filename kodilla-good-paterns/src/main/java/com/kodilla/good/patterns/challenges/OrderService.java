package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface OrderService {

    default boolean order(User user, LocalDate from, LocalDate to) {
        System.out.println("Ordering item for" + user.getName() + user.getSurname() + from.toString() + to.toString());
        return true;
    }
}


