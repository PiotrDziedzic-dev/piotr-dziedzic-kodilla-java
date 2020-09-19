package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import java.util.*;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {

    @Mock
    private Temperatures temperaturesMock;

    @Test
    void testCalculateForecastWithMock() {
        //Given
        double b;
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        for (Map.Entry<String, Double> abc : temperaturesMap.entrySet()) {
            double b += abc.getValue();
        }
        double arithmeticalAverage =  b/temperaturesMap.size();

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        when(temperaturesMock.calculateAverage()).thenReturn(arithmeticalAverage);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();
        double arithmeticalAverage1 = weatherForecast.calculateAverage();
        //Then
        Assertions.assertEquals(5, quantityOfSensors);
        Assertions.assertEquals(arithmeticalAverage,arithmeticalAverage1);
    }
}