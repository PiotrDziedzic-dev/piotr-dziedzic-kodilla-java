package com.kodilla.good.patterns.smallAirport;
import java.lang.*;

public class Flight {
    private String startingAirport;
    private String endingAirport;

    public Flight(String startingAirport, String endingAirport) {
        this.startingAirport = startingAirport;
        this.endingAirport = endingAirport;
    }

    @Override
    public String toString() {
        return "Flight from: "+startingAirport+" to "+endingAirport;
    }

}
