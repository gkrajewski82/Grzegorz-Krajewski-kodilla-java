package com.kodilla.good.patterns.flights;

public final class Flight {

    private final City departureCity;
    private final City arrivalCity;

    public Flight(final City departureCity, final City arrivalCity) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
    }

    public City getDepartureCity() {
        return departureCity;
    }

    public City getArrivalCity() {
        return arrivalCity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (departureCity != null ? !departureCity.equals(flight.departureCity) : flight.departureCity != null)
            return false;
        return arrivalCity != null ? arrivalCity.equals(flight.arrivalCity) : flight.arrivalCity == null;
    }

    @Override
    public int hashCode() {
        int result = departureCity != null ? departureCity.hashCode() : 0;
        result = 31 * result + (arrivalCity != null ? arrivalCity.hashCode() : 0);
        return result;
    }
}
