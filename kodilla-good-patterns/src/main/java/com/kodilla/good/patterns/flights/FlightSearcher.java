package com.kodilla.good.patterns.flights;

import java.util.*;
import java.util.stream.Collectors;

public final class FlightSearcher {

    private final FlightSetProcessor flightSetProcessor = new FlightSetProcessor();
    private final Set<Flight> flightSet = flightSetProcessor.generateFlightSet();

    public List<Flight> findFlightFrom(String departureCityName) {
        if (departureCityName != null) {
            return flightSet.stream()
                    .filter(flight -> flight.getDepartureCity().getCityName().equals(departureCityName))
                    .collect(Collectors.toList());
        }
        return null;
    }

    public List<Flight> findFlightTo(String arrivalCityName) {
        if (arrivalCityName != null) {
            return flightSet.stream()
                    .filter(flight -> flight.getArrivalCity().getCityName().equals(arrivalCityName))
                    .collect(Collectors.toList());
        }
        return null;
    }

    public List<Flight> findFlightFromToVia(String departureCityName, String viaCityName, String arrivalCityName) {
        List<Flight> flightList;

        flightList = flightSet.stream()
                .filter(flight -> flight.getDepartureCity().getCityName().equals(departureCityName) ||
                        flight.getArrivalCity().getCityName().equals(arrivalCityName))
                .filter(flight -> flight.getDepartureCity().getCityName().equals(viaCityName) ||
                        flight.getArrivalCity().getCityName().equals(viaCityName))
                .collect(Collectors.toList());

        if (departureCityName != null && viaCityName != null && arrivalCityName != null &&
                departureCityName != viaCityName && arrivalCityName != viaCityName && flightList.size() == 2) {
            return flightList;
        }
        return null;
    }
}