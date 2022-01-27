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
            System.out.println("Flights available from " + departureCity + ": (" + resultCity + ").");
        } else {
            System.out.println("Please fill in all fields correctly!");
        }
    }

    public void findFlightTo(String arrivalCity) {

        if (arrivalCity != null) {
            String resultCity = flightMap.entrySet().stream()
                    .filter(arrival -> arrival.getValue().contains(arrivalCity))
                    .map(departure -> departure.getKey().getDepartureCityName())
                    .collect(Collectors.joining(","));
            System.out.println("Flights available to " + arrivalCity + " from: (" + resultCity + ").");
        } else {
            System.out.println("Please fill in all fields correctly!");
        }
    }

    public void findFlightFromToVia(String departureCity, String viaCity, String arrivalCity) {

        List<String> possibleViaCityArrivalList = flightMap.entrySet().stream()
                .filter(departure -> Objects.equals(departure.getKey().getDepartureCityName(), departureCity))
                .flatMap(arrival -> arrival.getValue().stream())
                .collect(Collectors.toList());

        List<String> possibleViaCityDepartureList = flightMap.entrySet().stream()
                .filter(arrival -> arrival.getValue().contains(arrivalCity))
                .map(departure -> departure.getKey().getDepartureCityName())
                .collect(Collectors.toList());

        if (departureCity != null && viaCity != null && arrivalCity != null) {
            if (possibleViaCityArrivalList.contains(viaCity) && possibleViaCityDepartureList.contains(viaCity)) {
                System.out.println("Flight from " + departureCity + " via " + viaCity +
                        " to " + arrivalCity + " is available.");
            } else {
                System.out.println("Flight from " + departureCity + " via " + viaCity +
                        " to " + arrivalCity + " is not available.");
            }
        } else {
            System.out.println("Please fill in all fields correctly!");
        }
    }
}