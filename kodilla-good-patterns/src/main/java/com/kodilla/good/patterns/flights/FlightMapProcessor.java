package com.kodilla.good.patterns.flights;

import com.kodilla.good.patterns.flights.cities.ArrivalCityList;
import com.kodilla.good.patterns.flights.cities.City;
import com.kodilla.good.patterns.flights.cities.CityName;
import com.kodilla.good.patterns.flights.cities.DepartureCity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class FlightMapProcessor {

    private final City poznan = new DepartureCity(CityName.POZNAN);
    private final City gdansk = new DepartureCity(CityName.GDANSK);
    private final City rzeszow = new DepartureCity(CityName.RZESZOW);
    private final City krakow = new DepartureCity(CityName.KRAKOW);

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