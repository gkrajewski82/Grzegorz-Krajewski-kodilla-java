package com.kodilla.exception.test;

public class FlightSearchRunner {

    public static void main(String[] args) {

        Flight flight = new Flight("Warsaw", "Berlin");
        FlightSearcher flightsearcher = new FlightSearcher();

        try {
            flightsearcher.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("The airport does not exist in the schedule. Exception: " + e);
        }
    }
}