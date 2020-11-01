package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRequest {

    private User user;
    private LocalDate from;
    private LocalDate to;

    public OrderRequest(User user, LocalDate from, LocalDate to) {
        this.user = user;
        this.from = from;
        this.to = to;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getFrom() {
        return from;
    }

    public LocalDate getTo() {
        return to;
    }
}
