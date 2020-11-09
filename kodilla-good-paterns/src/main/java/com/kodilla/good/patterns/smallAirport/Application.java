package com.kodilla.good.patterns.smallAirport;

public class Application {
    public static void main(String[] args) {

        String myCity = "Kraków";
        String cityA = "Warszawa";
        String cityB = "Wrocław";
        ListOfFlights listOfFlights = new ListOfFlights();
        FlightFinder flightFinder = new FlightFinder(listOfFlights.getFlights());
        System.out.println("Finding flights to your city");
        flightFinder.findFlightFromMyCity(myCity);
        System.out.println("Finding flights from your city");
        flightFinder.findFlightToMyCity(myCity);
        System.out.println("Finding flights from city A to city B: ");
        flightFinder.findFlightsWithChange(listOfFlights.getFlights(),cityA,cityB);


    }
}
