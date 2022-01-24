package com.kodilla.good.patterns.flights;

import com.kodilla.good.patterns.flights.cities.DepartureCity;

import java.util.*;
import java.util.stream.Collectors;

public final class FlightSearcher {

    private final FlightMapProcessor flightMapProcessor = new FlightMapProcessor();
    private final Map<DepartureCity, List<String>> flightMap = flightMapProcessor.generateFlightMap();

    public void findFlightFrom(String departureCity) {
        if (departureCity != null) {
            String resultCity = flightMap.entrySet().stream()
                    .filter(departure -> Objects.equals(departure.getKey().getDepartureCityName(), departureCity))
                    .map(Map.Entry::getValue)
                    .flatMap(Collection::stream)
                    .collect(Collectors.joining(","));
            System.out.println("Flights available from " + departureCity + ": (" + resultCity + ")");
        } else {
            System.out.println("Invalid data");
        }
    }

    public void findFlightTo(String arrivalCity) {

        if (arrivalCity != null) {
            String resultCity = flightMap.entrySet().stream()
                    .filter(arrival -> arrival.getValue().contains(arrivalCity))
                    .map(departure -> departure.getKey().getDepartureCityName())
                    .collect(Collectors.joining(","));
            System.out.println("Flights available to " + arrivalCity + " from: (" + resultCity + ")");
        } else {
            System.out.println("Invalid data");
        }
    }

    public void findFlightFromToVia(String departureCity, String arrivalCity) {

        String resultViaCity = flightMap.entrySet().stream()
                .filter(arrival -> arrival.getValue().contains(arrivalCity))
                .filter(departure -> Objects.equals(departure.getKey().getDepartureCityName(), departureCity))
                .map(departure -> departure.getKey().getDepartureCityName())
                .collect(Collectors.joining(","));
        System.out.println("Flight from: " + resultViaCity + " to ");



    }
}