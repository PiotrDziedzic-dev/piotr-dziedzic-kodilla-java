package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;


    @Test
    void testCalculations(){

        //Given
        double a = 20;
        double b = 5;

        //When
        double sum = calculator.add(a,b);
        double difference = calculator.sub(a,b);
        double product = calculator.mul(a,b);
        double quotient = calculator.div(a,b);

        //Then
        assertEquals(sum,25);
        assertEquals(difference,15);
        assertEquals(product,100);
        assertEquals(quotient,4);

    }
}
