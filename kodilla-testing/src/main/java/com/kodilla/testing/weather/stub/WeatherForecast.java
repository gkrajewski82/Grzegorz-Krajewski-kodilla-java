package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverage() {
        double sum = 0;
        double average = 0;
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            Double value = temperature.getValue();
            sum = sum + value;
        }
        average = sum / temperatures.getTemperatures().size();
        return average;
    }

    public double calculateMedian() {
        List<Double> temperatureList = new ArrayList<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            Double temperatureValue = temperature.getValue();
            temperatureList.add(temperatureValue);
        }

        Collections.sort(temperatureList);
        double median = 0.0;
        int middleTemperature1 = temperatureList.size() / 2 - 1;
        int middleTemperature2 = temperatureList.size() / 2;

        if (temperatureList.size() % 2 != 0) {
            median = temperatureList.get((temperatureList.size() - 1) / 2);
        } else {
            median = (temperatureList.get(middleTemperature1) + temperatureList.get(middleTemperature2)) / 2;
        }
        return median;
    }
}

