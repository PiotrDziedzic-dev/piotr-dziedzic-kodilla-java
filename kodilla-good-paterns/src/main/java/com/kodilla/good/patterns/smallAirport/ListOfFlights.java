package com.kodilla.good.patterns.smallAirport;

import java.util.HashMap;
import java.util.Map;

public class ListOfFlights {


    DirectFlight directFlight1 = new DirectFlight("Kraków","Warszawa");
    DirectFlight directFlight2 = new DirectFlight("Kraków","Wrocław");
    DirectFlight directFlight3 = new DirectFlight("Kraków","Gdańsk");
    DirectFlight directFlight4 = new DirectFlight("Kraków","Poznań");
    DirectFlight directFlight5 = new DirectFlight("Wrocław","Kraków");
    DirectFlight directFlight6 = new DirectFlight("Wrocław","Warszawa");
    DirectFlight directFlight7 = new DirectFlight("Wrocław","Poznań");
    DirectFlight directFlight8 = new DirectFlight("Wrocław","Gdansk");
    DirectFlight directFlight9 = new DirectFlight("Warszawa","Kraków");
    DirectFlight directFlight10 = new DirectFlight("Warszawa","Gdańsk");
    DirectFlight directFlight11 = new DirectFlight("Warszawa","Wrocław");
    DirectFlight directFlight12 = new DirectFlight("Warszawa","Poznań");
    DirectFlight directFlight13 = new DirectFlight("Poznań","Wrocław");
    DirectFlight directFlight14 = new DirectFlight("Poznań","Kraków");
    DirectFlight directFlight15 = new DirectFlight("Poznań","Warszawa");
    DirectFlight directFlight16 = new DirectFlight("Poznań","Gdańsk");
    DirectFlight directFlight17 = new DirectFlight("Gdańsk","Kraków");
    DirectFlight directFlight18 = new DirectFlight("Gdańsk","Warszawa");
    DirectFlight directFlight19 = new DirectFlight("Gdańsk","Wrocław");
    DirectFlight directFlight20 = new DirectFlight("Gdańsk","Poznań");

    IndirectFlight indirectFlight1 = new IndirectFlight("Kraków","Warszawa","Gdańsk");
    IndirectFlight indirectFlight2 = new IndirectFlight("Gdańsk","Poznań","Kraków");
    IndirectFlight indirectFlight3 = new IndirectFlight("Poznań","Wrocław","Warszawa");
    IndirectFlight indirectFlight4 = new IndirectFlight("Warszawa","Kraków","Wrocław");
    IndirectFlight indirectFlight5 = new IndirectFlight("Wrocław","Gdańsk","Poznań");

    Map<NumberOfFlight,DirectFlight> directFlights = new HashMap<>();
    Map<NumberOfFlight,IndirectFlight> indirectFlights = new HashMap<>();

    public ListOfFlights () {
        directFlights.put(new NumberOfFlight(1), directFlight1);
        directFlights.put(new NumberOfFlight(2), directFlight2);
        directFlights.put(new NumberOfFlight(3), directFlight3);
        directFlights.put(new NumberOfFlight(4), directFlight4);
        directFlights.put(new NumberOfFlight(5), directFlight5);
        directFlights.put(new NumberOfFlight(6), directFlight6);
        directFlights.put(new NumberOfFlight(7), directFlight7);
        directFlights.put(new NumberOfFlight(8), directFlight8);
        directFlights.put(new NumberOfFlight(9), directFlight9);
        directFlights.put(new NumberOfFlight(10), directFlight10);
        directFlights.put(new NumberOfFlight(11), directFlight11);
        directFlights.put(new NumberOfFlight(12), directFlight12);
        directFlights.put(new NumberOfFlight(13), directFlight13);
        directFlights.put(new NumberOfFlight(14), directFlight14);
        directFlights.put(new NumberOfFlight(15), directFlight15);
        directFlights.put(new NumberOfFlight(16), directFlight16);
        directFlights.put(new NumberOfFlight(17), directFlight17);
        directFlights.put(new NumberOfFlight(18), directFlight18);
        directFlights.put(new NumberOfFlight(19), directFlight19);
        directFlights.put(new NumberOfFlight(20), directFlight20);

        indirectFlights.put(new NumberOfFlight(101),indirectFlight1);
        indirectFlights.put(new NumberOfFlight(102),indirectFlight2);
        indirectFlights.put(new NumberOfFlight(103),indirectFlight3);
        indirectFlights.put(new NumberOfFlight(104),indirectFlight4);
        indirectFlights.put(new NumberOfFlight(105),indirectFlight5);

    }

    public Map<NumberOfFlight, DirectFlight> getDirectFlights() {
        return directFlights;
    }

    public Map<NumberOfFlight, IndirectFlight> getIndirectFlights() {
        return indirectFlights;
    }
}
