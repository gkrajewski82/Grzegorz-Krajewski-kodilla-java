package com.kodilla.good.patterns.flights;

import com.kodilla.good.patterns.flights.cities.City;

import java.util.*;
import java.util.stream.Collectors;

public final class FlightSearcher {

    private final FlightMapProcessor flightMapProcessor = new FlightMapProcessor();
    private final Map<City, List<City>> flightMap = flightMapProcessor.generateFlightMap();

    public void findFlightFrom(String departureCity) {
        if (departureCity != null) {
            String resultCity = flightMap.entrySet().stream()
                    .filter(departure -> Objects.equals(departure.getKey().getCityName(), departureCity))
                    .map(Map.Entry::getValue)
                    .flatMap(Collection::stream)
                    .map(City::getCityName)
                    .collect(Collectors.joining(","));
            System.out.println("Flights available from " + departureCity + ": (" + resultCity + ")");
        } else {
            System.out.println("Invalid data");
        }
    }

    public void findFlightTo(String arrivalCity) {

        if (arrivalCity != null) {
            String resultCity = flightMap.entrySet().stream()
                    .filter(arrival -> arrival.getValue().contains())
                    .map(departure -> departure.getKey().getCityName())
                    .collect(Collectors.joining(","));
            System.out.println("Flights available to " + arrivalCity + " from: (" + resultCity + ")");
        } else {
            System.out.println("Invalid data");
        }
    }

    /* //Dlaczego to nie działa?//
    public void findFlightTo(String arrivalCity) {
        City theCity = new ArrivalCity(arrivalCity);

        if (arrivalCity != null) {
            String resultCity = flightMap.entrySet().stream()
                    .filter(arrival -> arrival.getValue().contains(theCity))
                    .map(departure -> departure.getKey().getCityName())
                    .collect(Collectors.joining(","));
            System.out.println("Flights available to " + arrivalCity + " from: (" + resultCity + ")");
        } else {
            System.out.println("Invalid data");
        }
    }*/

    /*public void findFlightToVia(String departureCity, String viaCity, String arrivalCity) {


    }*/

    public Map<City, List<City>> getFlightMap() {
        return flightMap;
    }
}