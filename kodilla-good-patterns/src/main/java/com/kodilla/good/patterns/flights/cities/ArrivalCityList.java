package com.kodilla.good.patterns.flights.cities;

import java.util.ArrayList;
import java.util.List;

public final class ArrivalCityList {

    private static final String POZNAN = "Poznań";
    private static final String GDANSK = "Gdańsk";
    private static final String RZESZOW = "Rzeszów";
    private static final String KRAKOW = "Kraków";

    public List<String> generateArrivalCityFromPoznanList() {
        List<String> arrivalCityFromPoznanList = new ArrayList<>();
        arrivalCityFromPoznanList.add(GDANSK);
        arrivalCityFromPoznanList.add(RZESZOW);
        return arrivalCityFromPoznanList;
    }

    public List<String> generateArrivalCityFromGdanskList() {
        List<String> arrivalCityFromGdanskList = new ArrayList<>();
        arrivalCityFromGdanskList.add(POZNAN);
        arrivalCityFromGdanskList.add(RZESZOW);
        arrivalCityFromGdanskList.add(KRAKOW);
        return arrivalCityFromGdanskList;
    }

    public List<String> generateArrivalCityFromRzeszowList() {
        List<String> arrivalCityFromRzeszowList = new ArrayList<>();
        arrivalCityFromRzeszowList.add(POZNAN);
        arrivalCityFromRzeszowList.add(GDANSK);
        return arrivalCityFromRzeszowList;
    }

    public List<String> generateArrivalCityFromKrakowList() {
        List<String> arrivalCityFromKrakowList = new ArrayList<>();
        arrivalCityFromKrakowList.add(POZNAN);
        arrivalCityFromKrakowList.add(GDANSK);
        arrivalCityFromKrakowList.add(RZESZOW);
        return arrivalCityFromKrakowList;
    }
}