package com.kodilla.good.patterns.flights.cities;

import java.util.ArrayList;
import java.util.List;

public final class ArrivalCityList {

    public List<String> generateArrivalCityFromPoznanList() {
        List<String> arrivalCityFromPoznanList = new ArrayList<>();
        arrivalCityFromPoznanList.add(City.GDANSK);
        arrivalCityFromPoznanList.add(City.RZESZOW);
        return arrivalCityFromPoznanList;
    }

    public List<String> generateArrivalCityFromGdanskList() {
        List<String> arrivalCityFromGdanskList = new ArrayList<>();
        arrivalCityFromGdanskList.add(City.POZNAN);
        arrivalCityFromGdanskList.add(City.RZESZOW);
        arrivalCityFromGdanskList.add(City.KRAKOW);
        return arrivalCityFromGdanskList;
    }

    public List<String> generateArrivalCityFromRzeszowList() {
        List<String> arrivalCityFromRzeszowList = new ArrayList<>();
        arrivalCityFromRzeszowList.add(City.POZNAN);
        arrivalCityFromRzeszowList.add(City.GDANSK);
        return arrivalCityFromRzeszowList;
    }

    public List<String> generateArrivalCityFromKrakowList() {
        List<String> arrivalCityFromKrakowList = new ArrayList<>();
        arrivalCityFromKrakowList.add(City.POZNAN);
        arrivalCityFromKrakowList.add(City.GDANSK);
        arrivalCityFromKrakowList.add(City.RZESZOW);
        return arrivalCityFromKrakowList;
    }
}