package com.kodilla.good.patterns.flights;

import com.kodilla.good.patterns.flights.cities.City;

import java.util.List;
import java.util.Map;

public final class FlightSearcher {

    private final FlightMapProcessor flightMapProcessor = new FlightMapProcessor();
    private final Map<City, List<City>> flightMap = flightMapProcessor.generateFlightMap();


    public String findFlightFrom(String departureCity) {

        return null;
    }

    public String findFlightTo(String arrivalCity) {

        return null;
    }

    public String findFlightToVia(String arrivalCity, String viaCity) {

        return null;
    }

    public Map<City, List<City>> getFlightMap() {
        return flightMap;
    }
}