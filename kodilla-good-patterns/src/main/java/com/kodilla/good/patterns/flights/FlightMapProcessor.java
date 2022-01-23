package com.kodilla.good.patterns.flights;

import com.kodilla.good.patterns.flights.cities.ArrivalCityList;
import com.kodilla.good.patterns.flights.cities.City;
import com.kodilla.good.patterns.flights.cities.DepartureCity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightMapProcessor {

    private final City poznan = new DepartureCity("Poznań");
    private final City gdansk = new DepartureCity("Gdańsk");
    private final City rzeszow = new DepartureCity("Rzeszów");
    private final City krakow = new DepartureCity("Kraków");

    private final ArrivalCityList arrivalCityList = new ArrivalCityList();
    private final List<City> arrivalCityFromPoznanList = arrivalCityList.generateArrivalCityFromPoznanList();
    private final List<City> ArrivalCityFromGdanskList = arrivalCityList.generateArrivalCityFromGdanskList();
    private final List<City> ArrivalCityFromRzeszowList = arrivalCityList.generateArrivalCityFromRzeszowList();
    private final List<City> ArrivalCityFromKrakowList = arrivalCityList.generateArrivalCityFromKrakowList();

    public Map<City, List<City>> generateFlightMap() {
        Map<City, List<City>> flightMap = new HashMap<>();
        flightMap.put(poznan, arrivalCityFromPoznanList);
        flightMap.put(gdansk, ArrivalCityFromGdanskList);
        flightMap.put(rzeszow, ArrivalCityFromRzeszowList);
        flightMap.put(krakow, ArrivalCityFromKrakowList);
        return flightMap;
    }
}