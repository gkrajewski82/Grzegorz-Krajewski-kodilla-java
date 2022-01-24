package com.kodilla.good.patterns.flights.cities;

public final class DepartureCity {

    private final String departureCityName;

    public DepartureCity(final String departureCityName) {
        this.departureCityName = departureCityName;
    }

    public String getDepartureCityName() {
        return departureCityName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DepartureCity that = (DepartureCity) o;

        return departureCityName != null ? departureCityName.equals(that.departureCityName) : that.departureCityName == null;
    }

    @Override
    public int hashCode() {
        return departureCityName != null ? departureCityName.hashCode() : 0;
    }
}