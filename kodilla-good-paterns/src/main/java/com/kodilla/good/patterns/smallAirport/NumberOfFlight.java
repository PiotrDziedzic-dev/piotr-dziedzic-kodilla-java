package com.kodilla.good.patterns.smallAirport;
import java.lang.*;


public class NumberOfFlight {
    private int number;

    public NumberOfFlight(int number) {
        this.number = number;
    }
    @Override
    public boolean equals(Object O){
        final NumberOfFlight e = (NumberOfFlight) O;
        return this.number == e.number;
    }

    @Override
    public int HashCode() {
        return number;
    }
}
