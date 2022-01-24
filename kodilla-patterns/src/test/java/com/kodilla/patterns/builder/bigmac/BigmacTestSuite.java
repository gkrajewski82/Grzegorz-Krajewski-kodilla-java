package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testNewBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Bułka z sezamem")
                .burgers(3)
                .sauce("standard")
                .ingredient("sałata")
                .ingredient("cebula")
                .ingredient("bekon")
                .ingredient("chilli")
                .ingredient("ser")
                .build();
        System.out.println(bigmac);

        //When
        int numberOfIngredients = bigmac.getIngredients().size();

        //Then
        assertEquals(5, numberOfIngredients);
    }
}