package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final BigDecimal amountOfPeople;

    public Country(final BigDecimal amountOfPeople) {
        this.amountOfPeople = amountOfPeople;
    }

    BigDecimal getPeopleQuantity() {
        return amountOfPeople;
    }

}
