package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface OrderService {

    default public boolean order(User user, LocalDate from, LocalDate to) {
        System.out.println("Ordering item for" + user.getName() + user.getSurnname() + from.toString() + to.toString());
        return true;
    }
}


