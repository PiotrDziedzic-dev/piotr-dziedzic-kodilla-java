package com.kodilla.good.patterns.smallAirport;

import java.util.Map;

public class FlightFinder {

    public void findDirectFlightToMyCity(Map<NumberOfFlight,DirectFlight> map, String myCity) {
        map.entrySet().stream()
                .filter(s->s.getValue().getEndingAirport().equals(myCity))
                .forEach(System.out::println);
    }
    public void findInDirectFlightToMyCity(Map<NumberOfFlight,IndirectFlight> map, String myCity) {
        map.entrySet().stream()
                .filter(s->s.getValue().getEndingAirport().equals(myCity))
                .forEach(System.out::println);
    }
    public void findDirectFlightFromMyCity(Map<NumberOfFlight,DirectFlight> map, String myCity) {
        map.entrySet().stream()
                .filter(s->s.getValue().getStartingAirport().equals(myCity))
                .forEach(System.out::println);
    }
    public void findInDirectFlightFromMyCity(Map<NumberOfFlight,IndirectFlight> map, String myCity) {
        map.entrySet().stream()
                .filter(s->s.getValue().getStartingAirport().equals(myCity))
                .forEach(System.out::println);
    }

}
