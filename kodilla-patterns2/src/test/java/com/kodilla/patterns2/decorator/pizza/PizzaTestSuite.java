package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaTestSuite {

    @Test
    void testNinjaPizzaBasicGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new NinjaPizzaOrderDecorator(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Your order is: basic (thin bottom, tomato sauce, cheese) from NinjaPizza", description);
    }

    @Test
    void testNinjaPizzaBasicGetPrice() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new NinjaPizzaOrderDecorator(theOrder);

        //When
        BigDecimal thePrice = theOrder.getPrice();

        //Then
        assertEquals(new BigDecimal(15), thePrice);
    }

    @Test
    void testPizzaStationThickBottomHamGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaStationOrderDecorator(theOrder);
        theOrder = new ThickBottom(theOrder);
        theOrder = new Salami(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Your order is: basic (thin bottom, tomato sauce, cheese) from PizzaStation + thick bottom" +
                " + salami", description);
    }

    @Test
    void testPizzaStationThickBottomHamGetPrice() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaStationOrderDecorator(theOrder);
        theOrder = new ThickBottom(theOrder);
        theOrder = new Salami(theOrder);

        //When
        BigDecimal thePrice = theOrder.getPrice();

        //Then
        assertEquals(new BigDecimal(18), thePrice);
    }

    @Test
    void testNinjaPizzaSalamiOnionMushroomsExtraCheeseGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new NinjaPizzaOrderDecorator(theOrder);
        theOrder = new Salami(theOrder);
        theOrder = new Onion(theOrder);
        theOrder = new Mushrooms(theOrder);
        theOrder = new ExtraCheese(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Your order is: basic (thin bottom, tomato sauce, cheese) from NinjaPizza + salami +" +
                " onion + mushrooms + extra cheese", description);
    }

    @Test
    void testNinjaPizzaSalamiOnionMushroomsExtraCheeseGetPrice() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new NinjaPizzaOrderDecorator(theOrder);
        theOrder = new Salami(theOrder);
        theOrder = new Onion(theOrder);
        theOrder = new Mushrooms(theOrder);
        theOrder = new ExtraCheese(theOrder);

        //When
        BigDecimal thePrice = theOrder.getPrice();

        //Then
        assertEquals(new BigDecimal(25), thePrice);
    }
}
