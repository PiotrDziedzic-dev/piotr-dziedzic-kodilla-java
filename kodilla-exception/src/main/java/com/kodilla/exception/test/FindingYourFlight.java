package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;



public class FindingYourFlight {

    private Map<String,Boolean> availableAirports = new HashMap<>();

    private void prepareFlight () {
        availableAirports.put("Amsterdam",true);
        availableAirports.put("London",false);
        availableAirports.put("Madrit",true);
        availableAirports.put("Rome",false);
    }

    String findFlight(Flight flight) throws RouteNotFoundException {

        FindingYourFlight abc = new FindingYourFlight();
        abc.prepareFlight();

        boolean X = false;
        for (Map.Entry<String,Boolean> entry :availableAirports.entrySet())
            if(flight.getArrivalAirport() == entry.getKey()) {
                X = true;
            }
        if(X = true) {
            return "Your airport is available";
        } else {
            throw new RouteNotFoundException();
        }
    }
}
