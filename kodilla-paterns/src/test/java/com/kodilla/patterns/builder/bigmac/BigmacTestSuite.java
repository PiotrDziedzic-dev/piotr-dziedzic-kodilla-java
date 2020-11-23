package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigmacTestSuite {

    @Test
    void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Classic")
                .burgers(2)
                .sauce("Barbecue")
                .ingredient("Lettuce")
                .ingredient("Onion")
                .ingredient("Bacon")
                .ingredient("Mushrooms")
                .build();

        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        Assertions.assertEquals(howManyIngredients,4);
    }
}
