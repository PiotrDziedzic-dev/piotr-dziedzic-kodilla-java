package com.kodilla.good.patterns.smallAirport;

public class IndirectFlight {
    private String startingAirport;
    private String endingAirport;
    private String middleAirport;

    public IndirectFlight(String startingAirport, String middleAirport, String endingAirport) {
        this.startingAirport = startingAirport;
        this.endingAirport = middleAirport;
        this.endingAirport = endingAirport;
    }

    @Override
    public String toString() {
        return " Flight from: "+startingAirport+" via: "+ middleAirport+" to:"+endingAirport;
    }

    public String getStartingAirport() {
        return startingAirport;
    }

    public String getEndingAirport() {
        return endingAirport;
    }

    public String getMiddleAirport() {
        return middleAirport;
    }
}
