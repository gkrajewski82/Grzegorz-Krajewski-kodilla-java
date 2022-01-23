package com.kodilla.good.patterns.flights.cities;

public class ArrivalCity implements City {

    private String arrivalCityName;

    public ArrivalCity(String arrivalCityName) {
        this.arrivalCityName = arrivalCityName;
    }

    @Override
    public String getCityName() {
        return arrivalCityName;
    }
}