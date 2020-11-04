package com.kodilla.good.patterns.smallAirport;

public class Application {
    public static void main(String[] args) {

        String myCity = "Kraków";
        ListOfFlights listOfFlights = new ListOfFlights();
        FlightFinder flightFinder = new FlightFinder();
        System.out.println("Finding flights to your city");
        flightFinder.findDirectFlightFromMyCity(listOfFlights.getDirectFlights(),myCity);
        flightFinder.findInDirectFlightFromMyCity(listOfFlights.getIndirectFlights(),myCity);
        System.out.println("Finding flights from your city");
        flightFinder.findDirectFlightToMyCity(listOfFlights.getDirectFlights(),myCity);
        flightFinder.findInDirectFlightToMyCity(listOfFlights.getIndirectFlights(),myCity);

    }
}
