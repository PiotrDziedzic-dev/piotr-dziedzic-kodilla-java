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

    void findFlight(Flight flight) throws RouteNotFoundException {

        prepareFlight();

        Boolean available;
        Boolean exists = availableAirports.get(flight.getArrivalAirport());

        if(availableAirports.containsKey(flight.getArrivalAirport()) && availableAirports.get(flight.getArrivalAirport())) {
            available = true;
        } else {
            available = false;
        }


        if(exists!=null) {

            if(available) {
                System.out.println("Your flight is available");
            } else {
                System.out.println("Your flight is available but we sold all tickets sorry");
            }
        } else {
            throw new RouteNotFoundException();
        }

    }
}
