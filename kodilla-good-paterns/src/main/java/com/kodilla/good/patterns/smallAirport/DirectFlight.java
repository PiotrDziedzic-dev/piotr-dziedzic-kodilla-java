package com.kodilla.good.patterns.smallAirport;
import java.lang.*;

public class DirectFlight {
    private String startingAirport;
    private String endingAirport;

    public DirectFlight(String startingAirport, String endingAirport) {
        this.startingAirport = startingAirport;
        this.endingAirport = endingAirport;
    }

    @Override
    public String toString() {
        return " Flight from: "+startingAirport+" to "+endingAirport;
    }

    public String getStartingAirport() {
        return startingAirport;
    }

    public String getEndingAirport() {
        return endingAirport;
    }
}
