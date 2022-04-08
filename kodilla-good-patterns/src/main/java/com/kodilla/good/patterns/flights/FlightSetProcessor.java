package com.kodilla.good.patterns.flights;

import java.util.LinkedHashSet;
import java.util.Set;

public final class FlightSetProcessor {

    final Set<Flight> flightSet = new LinkedHashSet<>();

    City poznan = new City("Poznań");
    City gdansk = new City("Gdańsk");
    City rzeszow = new City("Rzeszów");
    City krakow = new City("Kraków");
    City warszawa = new City("Warszawa");

    Flight poznanGdansk = new Flight(poznan, gdansk);
    Flight poznanRzeszow = new Flight(poznan, rzeszow);
    Flight poznanWarszawa = new Flight(poznan, warszawa);

    Flight gdanskPoznan = new Flight(gdansk, poznan);
    Flight gdanskRzeszow = new Flight(gdansk, rzeszow);
    Flight gdanskKrakow = new Flight(gdansk, krakow);
    Flight gdanskWarszawa = new Flight(gdansk, warszawa);

    Flight rzeszowPoznan = new Flight(rzeszow, poznan);
    Flight rzeszowGdansk = new Flight(rzeszow, gdansk);

    Flight krakowPoznan = new Flight(krakow, poznan);
    Flight krakowGdansk = new Flight(krakow, gdansk);
    Flight krakowRzeszow = new Flight(krakow, rzeszow);

    Flight warszawaRzeszow = new Flight(warszawa, rzeszow);
    Flight warszawaGdansk = new Flight(warszawa, gdansk);

    public Set<Flight> generateFlightSet() {
        flightSet.add(poznanGdansk);
        flightSet.add(poznanRzeszow);
        flightSet.add(poznanWarszawa);
        flightSet.add(gdanskPoznan);
        flightSet.add(gdanskRzeszow);
        flightSet.add(gdanskKrakow);
        flightSet.add(gdanskWarszawa);
        flightSet.add(rzeszowPoznan);
        flightSet.add(rzeszowGdansk);
        flightSet.add(krakowPoznan);
        flightSet.add(krakowGdansk);
        flightSet.add(krakowRzeszow);
        flightSet.add(warszawaRzeszow);
        flightSet.add(warszawaGdansk);

        return flightSet;
    }
}