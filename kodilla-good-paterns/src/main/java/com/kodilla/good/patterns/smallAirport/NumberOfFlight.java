package com.kodilla.good.patterns.smallAirport;
import java.lang.*;


public class NumberOfFlight {
    private Integer number;

    public NumberOfFlight(int number) {
        this.number = number;
    }
    @Override
    public boolean equals(Object O){
        final NumberOfFlight e = (NumberOfFlight) O;
        return this.number == e.number;
    }

    @Override
    public int hashCode() {
        return number;
    }

    @Override
    public String toString() {
        return number.toString()+" ";
    }
}
