package com.kodilla.good.patterns.flights.cities;

public final class ArrivalCity implements City {

    private final String arrivalCityName;

    public ArrivalCity(final String arrivalCityName) {
        this.arrivalCityName = arrivalCityName;
    }

    @Override
    public String getCityName() {
        return arrivalCityName;
    }
}