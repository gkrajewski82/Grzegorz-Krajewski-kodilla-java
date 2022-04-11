package com.kodilla.good.patterns.flights;

public final class City {

    private final String cityName;

    public City(final String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    @Override
    public String toString() {
        return cityName;
    }
}