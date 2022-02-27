package com.kodilla.good.patterns.flights;

import java.util.LinkedHashSet;
import java.util.Set;

public final class FlightSetProcessor {

    final Set<Flight> flightsSet = new LinkedHashSet<>();

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
        flightsSet.add(poznanGdansk);
        flightsSet.add(poznanRzeszow);
        flightsSet.add(poznanWarszawa);
        flightsSet.add(gdanskPoznan);
        flightsSet.add(gdanskRzeszow);
        flightsSet.add(gdanskKrakow);
        flightsSet.add(gdanskWarszawa);
        flightsSet.add(rzeszowPoznan);
        flightsSet.add(rzeszowGdansk);
        flightsSet.add(krakowPoznan);
        flightsSet.add(krakowGdansk);
        flightsSet.add(krakowRzeszow);
        flightsSet.add(warszawaRzeszow);
        flightsSet.add(warszawaGdansk);

        return flightsSet;
    }
}