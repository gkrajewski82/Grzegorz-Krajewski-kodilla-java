package com.kodilla.good.patterns.flights;


public class FlightSearchService {

    public static void main(String[] args) {

        FlightSearcher flightSearcher = new FlightSearcher();
        flightSearcher.findFlightFrom("Poznań");
        flightSearcher.findFlightTo("Poznań");
        //flightSearcher.findFlightToVia(null, null);
    }
}