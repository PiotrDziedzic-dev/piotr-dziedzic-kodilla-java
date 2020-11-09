package com.kodilla.good.patterns.smallAirport;

import java.util.Map;

public class FlightFinder {


    private String temporaryString1;
    private String temporaryString2;
    private String temporaryString3;
    private final Map<Integer, Flight> mapOfDirectFlights;

    public FlightFinder(Map<Integer, Flight> mapOfDirectFlights) {
        this.mapOfDirectFlights = mapOfDirectFlights;
    }

    public void findFlightToMyCity(String myCity) {
        mapOfDirectFlights.entrySet().stream()
                .filter(s->s.getValue().getEndingAirport().equals(myCity))
                .forEach(System.out::println);
        System.out.println();
    }
    public void findFlightFromMyCity(String myCity) {
        mapOfDirectFlights.entrySet().stream()
                .filter(s->s.getValue().getStartingAirport().equals(myCity))
                .forEach(System.out::println);
        System.out.println();
    }
    public void findFlightsWithChange(Map<Integer,Flight> mapOfDirectFlights, String cityA, String cityB) {
        for(Map.Entry<Integer,Flight> entry : mapOfDirectFlights.entrySet()) {
            if (entry.getValue().getEndingAirport().equals(cityB)) {
                if (entry.getValue().getStartingAirport().equals(cityA)) {
                    System.out.println(entry.getValue());
                } else {
                    temporaryString1 = entry.getValue().getStartingAirport();
                    for (Map.Entry<Integer, Flight> entry1 : mapOfDirectFlights.entrySet()) {
                        if (entry1.getValue().getEndingAirport().equals(temporaryString1))
                            if (entry1.getValue().getStartingAirport().equals(cityA)) {
                                System.out.println(entry1.getValue() + " +" + entry.getValue());
                            }
                    }
                }
            }
        }

    }

}
