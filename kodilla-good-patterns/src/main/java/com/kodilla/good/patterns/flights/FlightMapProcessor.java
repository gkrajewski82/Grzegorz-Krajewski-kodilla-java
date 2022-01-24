package com.kodilla.good.patterns.flights;

import com.kodilla.good.patterns.flights.cities.ArrivalCityList;
import com.kodilla.good.patterns.flights.cities.DepartureCity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class FlightMapProcessor {

    private final DepartureCity poznan = new DepartureCity("Poznań");
    private final DepartureCity gdansk = new DepartureCity("Gdańsk");
    private final DepartureCity rzeszow = new DepartureCity("Rzeszów");
    private final DepartureCity krakow = new DepartureCity("Kraków");

    private final ArrivalCityList arrivalCityList = new ArrivalCityList();
    private final List<String> arrivalCityFromPoznanList = arrivalCityList.generateArrivalCityFromPoznanList();
    private final List<String> ArrivalCityFromGdanskList = arrivalCityList.generateArrivalCityFromGdanskList();
    private final List<String> ArrivalCityFromRzeszowList = arrivalCityList.generateArrivalCityFromRzeszowList();
    private final List<String> ArrivalCityFromKrakowList = arrivalCityList.generateArrivalCityFromKrakowList();

    public Map<DepartureCity, List<String>> generateFlightMap() {
        Map<DepartureCity, List<String>> flightMap = new HashMap<>();
        flightMap.put(poznan, arrivalCityFromPoznanList);
        flightMap.put(gdansk, ArrivalCityFromGdanskList);
        flightMap.put(rzeszow, ArrivalCityFromRzeszowList);
        flightMap.put(krakow, ArrivalCityFromKrakowList);
        return flightMap;
    }
}