package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.kodilla.stream.world.*;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        BigDecimal a = new BigDecimal("1000000000");

        Country france = new Country(a);
        Country germany = new Country(a);
        Country china = new Country(a);
        Country japan = new Country(a);
        Country algeria = new Country(a);
        Country egypt = new Country(a);
        Country australia = new Country(a);
        Country newZealand = new Country(a);
        Country iceIceMoreIce = new Country(a);
        Country usa = new Country(a);
        Country canada = new Country(a);
        Country argentina = new Country(a);
        Country brazil = new Country(a);

        Continent europe = new Continent();
        europe.addCountry(france);
        europe.addCountry(germany);
        Continent asia = new Continent();
        asia.addCountry(china);
        asia.addCountry(japan);
        Continent africa = new Continent();
        africa.addCountry(algeria);
        africa.addCountry(egypt);
        Continent australia_continent = new Continent();
        australia_continent.addCountry(newZealand);
        australia_continent.addCountry(australia);
        Continent northAmerica = new Continent();
        northAmerica.addCountry(usa);
        northAmerica.addCountry(canada);
        Continent southAmerica = new Continent();
        southAmerica.addCountry(argentina);
        southAmerica.addCountry(brazil);
        Continent antarctica = new Continent();
        antarctica.addCountry(iceIceMoreIce);

        World world = new World();

        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);
        world.addContinent(australia_continent);
        world.addContinent(southAmerica);
        world.addContinent(northAmerica);
        world.addContinent(antarctica);

        //When
        BigDecimal expectedValue = world.getPeopleQuantity();

        //Then
        BigDecimal realValue = new BigDecimal("13000000000");
        Assertions.assertEquals(realValue,expectedValue);


    }
}
