package com.kodilla.good.patterns.flights;

import java.util.*;
import java.util.stream.Collectors;

public final class FlightSearcher {

    private final FlightSetProcessor flightSetProcessor = new FlightSetProcessor();
    private final Set<Flight> flightSet = flightSetProcessor.generateFlightSet();

    public List<Flight> findFlightFrom(City departureCity) {
        if (departureCity != null) {
            return flightSet.stream()
                    .filter(flight -> flight.getDepartureCity().equals(departureCity))
                    .collect(Collectors.toList());
        }
        return null;
    }

    public List<Flight> findFlightTo(City arrivalCity) {
        if (arrivalCity != null) {
            return flightSet.stream()
                    .filter(flight -> flight.getArrivalCity().equals(arrivalCity))
                    .collect(Collectors.toList());
        }
        return null;
    }
    /*public List<Flight> findFlightFromToVia(City departureCity, City viaCity, City arrivalCity) {
        List<City> arrivalCityList = flightSet.stream()
                .filter(flight -> flight.getDepartureCity().equals())

                .collect(Collectors.toList());

        List<City> departureCityList = flightMap.entrySet().stream()
                .filter(arrival -> arrival.getValue().contains(arrivalCity))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        if (departureCity != null && viaCity != null && arrivalCity != null && arrivalCityList.contains(viaCity) &&
            departureCityList.contains(viaCity)) {
            Flight theFlight = new Flight(departureCity, viaCity, arrivalCity);
            return true;
        }
        return null
    }*/

}