package com.kodilla.good.patterns.flights;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightSearcherTestSuite {

    //Given
    FlightSearcher flightSearcher = new FlightSearcher();

    @Test
    void findFlightFromTest() {

        //When
        List<Flight> possibleFlightList = flightSearcher.findFlightFrom("Gdańsk");

        //Then
        assertEquals(4, possibleFlightList.size());
    }

    @Test
    void findFlightToTest() {

        //When
        List<Flight> possibleFlightList = flightSearcher.findFlightTo("Poznań");

        //Then
        assertEquals(3, possibleFlightList.size());
    }

    @Test
    void findFlightFromToViaTest() {

        //When
        List<Flight> possibleFlightList =
                flightSearcher.findFlightFromToVia("Poznań", "Rzeszów", "Gdańsk");

        //Then
        assertEquals(2, possibleFlightList.size());
    }
}