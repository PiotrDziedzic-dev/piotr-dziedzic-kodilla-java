package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class World {
    private final Set<Continent> listOfContinents = new HashSet<>();

    public void addContinent(Continent continent) {
        listOfContinents.add(continent);
    }
    public Set<Continent> getContinents() {
        return listOfContinents;
    }

    BigDecimal getPeopleQuantity() {
          return listOfContinents.stream()
                  .flatMap(continent -> continent.getCountries().stream())
                  .map(Country::getPeopleQuantity)
                  .reduce(BigDecimal.ZERO, (sum,current) -> sum = sum.add(current));
    }


}
