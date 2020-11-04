package com.kodilla.good.patterns.smallAirport;

import java.util.HashMap;
import java.util.Map;

public class ListOfFlights {

    NumberOfFlight numberOfFlight1 = new NumberOfFlight(1);
    NumberOfFlight numberOfFlight2 = new NumberOfFlight(2);
    NumberOfFlight numberOfFlight3 = new NumberOfFlight(3);
    NumberOfFlight numberOfFlight4 = new NumberOfFlight(4);
    NumberOfFlight numberOfFlight5 = new NumberOfFlight(5);
    NumberOfFlight numberOfFlight6 = new NumberOfFlight(6);
    NumberOfFlight numberOfFlight7 = new NumberOfFlight(7);
    NumberOfFlight numberOfFlight8 = new NumberOfFlight(8);
    NumberOfFlight numberOfFlight9 = new NumberOfFlight(9);
    NumberOfFlight numberOfFlight10 = new NumberOfFlight(10);
    NumberOfFlight numberOfFlight11 = new NumberOfFlight(11);
    NumberOfFlight numberOfFlight12 = new NumberOfFlight(12);
    NumberOfFlight numberOfFlight13 = new NumberOfFlight(13);
    NumberOfFlight numberOfFlight14 = new NumberOfFlight(14);
    NumberOfFlight numberOfFlight15 = new NumberOfFlight(15);
    NumberOfFlight numberOfFlight16 = new NumberOfFlight(16);
    NumberOfFlight numberOfFlight17 = new NumberOfFlight(17);
    NumberOfFlight numberOfFlight18 = new NumberOfFlight(18);
    NumberOfFlight numberOfFlight19 = new NumberOfFlight(19);
    NumberOfFlight numberOfFlight20 = new NumberOfFlight(20);


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
    Flight flight11= new Flight("Warszawa","Wrocław");
    Flight flight12 = new Flight("Warszawa","Poznań");
    Flight flight13 = new Flight("Poznań","Wrocław");
    Flight flight14 = new Flight("Poznań","Kraków");
    Flight flight15 = new Flight("Poznań","Warszawa");
    Flight flight16 = new Flight("Poznań","Gdańsk");
    Flight flight17 = new Flight("Gdańsk","Kraków");
    Flight flight18 = new Flight("Gdańsk","Warszawa");
    Flight flight19 = new Flight("Gdańsk","Wrocław");
    Flight flight20 = new Flight("Gdańsk","Poznań");

    Map<NumberOfFlight,Flight> directFlights = new HashMap<>();
    directFlights.put(numberOfFlight1,flight1);

}
