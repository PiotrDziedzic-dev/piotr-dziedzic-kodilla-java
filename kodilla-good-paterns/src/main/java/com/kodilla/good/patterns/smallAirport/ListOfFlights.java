package com.kodilla.good.patterns.smallAirport;

import java.util.HashMap;
import java.util.Map;

public class ListOfFlights {


    Flight flight1 = new Flight("Kraków","Warszawa");
    Flight flight2 = new Flight("Kraków","Wrocław");
    Flight flight3 = new Flight("Kraków","Gdańsk");
    Flight flight4 = new Flight("Kraków","Poznań");
    Flight flight5 = new Flight("Wrocław","Kraków");
    Flight flight6 = new Flight("Wrocław","Warszawa");
    Flight flight7 = new Flight("Wrocław","Poznań");
    Flight flight8 = new Flight("Wrocław","Gdansk");
    Flight flight9 = new Flight("Warszawa","Kraków");
    Flight flight10 = new Flight("Warszawa","Gdańsk");
    Flight flight11 = new Flight("Warszawa","Wrocław");
    Flight flight12 = new Flight("Warszawa","Poznań");
    Flight flight13 = new Flight("Poznań","Wrocław");
    Flight flight14 = new Flight("Poznań","Kraków");
    Flight flight15 = new Flight("Poznań","Warszawa");
    Flight flight16 = new Flight("Poznań","Gdańsk");
    Flight flight17 = new Flight("Gdańsk","Kraków");
    Flight flight18 = new Flight("Gdańsk","Warszawa");
    Flight flight19 = new Flight("Gdańsk","Wrocław");
    Flight flight20 = new Flight("Gdańsk","Poznań");
    Flight flight21 = new Flight("Warszawa","Londyn");

    private Map<Integer, Flight> flights = new HashMap<>();

    public ListOfFlights () {

        flights.put(1, flight1);
        flights.put(2, flight2);
        flights.put(3, flight3);
        flights.put(4, flight4);
        flights.put(5, flight5);
        flights.put(6, flight6);
        flights.put(7, flight7);
        flights.put(8, flight8);
        flights.put(9, flight9);
        flights.put(10, flight10);
        flights.put(11, flight11);
        flights.put(12, flight12);
        flights.put(13, flight13);
        flights.put(14, flight14);
        flights.put(15, flight15);
        flights.put(16, flight16);
        flights.put(17, flight17);
        flights.put(18, flight18);
        flights.put(19, flight19);
        flights.put(20, flight20);
        flights.put(21, flight21);


    }

    public Map<Integer, Flight> getFlights() {
        return flights;
    }

}
