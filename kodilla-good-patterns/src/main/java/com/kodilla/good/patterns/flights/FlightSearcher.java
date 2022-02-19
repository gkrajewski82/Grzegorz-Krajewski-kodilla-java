package com.kodilla.good.patterns.flights;

import com.kodilla.good.patterns.flights.cities.City;

import java.util.*;
import java.util.stream.Collectors;

public final class FlightSearcher {

    private final FlightMapProcessor flightMapProcessor = new FlightMapProcessor();
    private final Map<City, List<City>> flightMap = flightMapProcessor.generateFlightMap();

    /*public List<FlightDto> findFlightFrom(City departureCity) {
        if (departureCity != null) {
            return flightMap.entrySet().stream()
                    .filter(departure -> Objects.equals(departure.getKey(), departureCity))
                    .flatMap(a -> a.getValue().stream())
                    .map(cityListEntry -> new FlightDto(departureCity, cityListEntry.getValue())

                    .collect(Collectors.toList());
        }
        return null;
    }*/

    public List<FlightDto> findFlightTo(City arrivalCity) {
        if (arrivalCity != null) {
            return flightMap.entrySet().stream()
                    .filter(arrival -> arrival.getValue().contains(arrivalCity))
                    .map(entry -> new FlightDto(entry.getKey(), arrivalCity))
                    .collect(Collectors.toList());
        }
        return null;
    }

    public boolean findFlightFromToVia(City departureCity, City viaCity, City arrivalCity) {
        List<City> arrivalCityList = flightMap.entrySet().stream()
                .filter(departure -> Objects.equals(departure.getKey(), departureCity))
                .map(Map.Entry::getValue)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        List<City> departureCityList = flightMap.entrySet().stream()
                .filter(arrival -> arrival.getValue().contains(arrivalCity))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        if (departureCity != null && viaCity != null && arrivalCity != null && arrivalCityList.contains(viaCity) &&
            departureCityList.contains(viaCity)) {
            FlightDto theFlight = new FlightDto(departureCity, viaCity, arrivalCity);
            return true;
        }
        return false;
    }
}