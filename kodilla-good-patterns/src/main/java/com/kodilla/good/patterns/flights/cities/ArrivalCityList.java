package com.kodilla.good.patterns.flights.cities;

import java.util.ArrayList;
import java.util.List;

public final class ArrivalCityList {

    private final City poznan = new ArrivalCity("Poznań");
    private final City gdansk = new ArrivalCity("Gdańsk");
    private final City rzeszow = new ArrivalCity("Rzeszów");
    private final City krakow = new ArrivalCity("Kraków");

    public List<City> generateArrivalCityFromPoznanList() {
        List<City> arrivalCityFromPoznanList = new ArrayList<>();
        arrivalCityFromPoznanList.add(gdansk);
        arrivalCityFromPoznanList.add(rzeszow);
        return arrivalCityFromPoznanList;
    }

    public List<City> generateArrivalCityFromGdanskList() {
        List<City> arrivalCityFromGdanskList = new ArrayList<>();
        arrivalCityFromGdanskList.add(poznan);
        arrivalCityFromGdanskList.add(rzeszow);
        arrivalCityFromGdanskList.add(krakow);
        return arrivalCityFromGdanskList;
    }

    public List<City> generateArrivalCityFromRzeszowList() {
        List<City> arrivalCityFromRzeszowList = new ArrayList<>();
        arrivalCityFromRzeszowList.add(poznan);
        arrivalCityFromRzeszowList.add(gdansk);
        return arrivalCityFromRzeszowList;
    }

    public List<City> generateArrivalCityFromKrakowList() {
        List<City> arrivalCityFromKrakowList = new ArrayList<>();
        arrivalCityFromKrakowList.add(poznan);
        arrivalCityFromKrakowList.add(gdansk);
        arrivalCityFromKrakowList.add(rzeszow);
        return arrivalCityFromKrakowList;
    }
}