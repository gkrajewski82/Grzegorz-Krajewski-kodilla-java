package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearcher {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> mapOfAirports = new HashMap<>();
        mapOfAirports.put("Berlin", true);
        mapOfAirports.put("Paris", false);
        mapOfAirports.put("Rome", false);
        mapOfAirports.put("Athens", true);
        mapOfAirports.put("Madrid", false);



    }
}