package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(5),calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Make a pizza",description);
    }

    @Test
    public void testBigPizzaDoubleCheeseExcelusiveDoughKetchupGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new BigPizzaDecorator(pizzaOrder);
        pizzaOrder = new DoubleCheeseDecorator(pizzaOrder);
        pizzaOrder = new ExcelusiveDoughDecorator(pizzaOrder);
        pizzaOrder = new KetchupDecorator(pizzaOrder);
        //When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(28),calculatedCost);
    }
    @Test
    public void testBigPizzaDoubleCheeseExcelusiveDoughKetchupGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new BigPizzaDecorator(pizzaOrder);
        pizzaOrder = new DoubleCheeseDecorator(pizzaOrder);
        pizzaOrder = new ExcelusiveDoughDecorator(pizzaOrder);
        pizzaOrder = new KetchupDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Make a pizza + big pizza + double cheese + excelusive dough + ketchup",description);
    }



}

