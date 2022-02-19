package com.kodilla.good.patterns.flights.cities;

import java.util.ArrayList;
import java.util.List;

public final class ArrivalCityList {

    private final City poznan = new ArrivalCity(CityName.POZNAN);
    private final City gdansk = new ArrivalCity(CityName.GDANSK);
    private final City rzeszow = new ArrivalCity(CityName.RZESZOW);
    private final City krakow = new ArrivalCity(CityName.KRAKOW);
    private final City warszawa = new ArrivalCity(CityName.WARSZAWA);
    private final City katowice = new ArrivalCity(CityName.KATOWICE);

    public List<City> generateArrivalCityFromPoznanList() {
        List<City> arrivalCityFromPoznanList = new ArrayList<>();
        arrivalCityFromPoznanList.add(gdansk);
        arrivalCityFromPoznanList.add(rzeszow);
        arrivalCityFromPoznanList.add(warszawa);
        return arrivalCityFromPoznanList;
    }

    public List<City> generateArrivalCityFromGdanskList() {
        List<City> arrivalCityFromGdanskList = new ArrayList<>();
        arrivalCityFromGdanskList.add(poznan);
        arrivalCityFromGdanskList.add(rzeszow);
        arrivalCityFromGdanskList.add(krakow);
        arrivalCityFromGdanskList.add(warszawa);
        arrivalCityFromGdanskList.add(katowice);
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