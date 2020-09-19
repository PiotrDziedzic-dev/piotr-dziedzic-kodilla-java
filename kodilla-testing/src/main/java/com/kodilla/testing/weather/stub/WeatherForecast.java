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

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverage() {
        double x = 0;
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            x += temperature.getValue();
        }
        return x/temperatures.getTemperatures().size();
    }

    public double calculateMediana() {

        List<Double> xyz = new ArrayList<>(temperatures.getTemperatures().values());
        Collections.sort(xyz);
        double b = 0;
        if(xyz.size() % 2 == 0) {
            b = (xyz.get((xyz.size()/2)-1) + xyz.get((xyz.size()/2)+1))/2;

        } else {
            b = xyz.get(xyz.size()/2);
        }
        return b;
    }
}
