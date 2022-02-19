package com.kodilla.good.patterns.flights;

import com.kodilla.good.patterns.flights.cities.City;

public class FlightDto {

    City departureCity;
    City viaCity;
    City arrivalCity;

    public FlightDto(City departureCity, City arrivalCity) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
    }

    public FlightDto(City departureCity, City viaCity, City arrivalCity) {
        this.departureCity = departureCity;
        this.viaCity = viaCity;
        this.arrivalCity = arrivalCity;
    }
}
