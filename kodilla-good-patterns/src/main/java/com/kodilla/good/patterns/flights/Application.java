package com.kodilla.good.patterns.flights;


public class Application {

    public static void main(String[] args) {

        FlightSearcher flightSearcher = new FlightSearcher();
        flightSearcher.findFlightFrom(null);
        flightSearcher.findFlightTo(null);
        flightSearcher.findFlightToVia(null, null);
    }
}