package com.example.monitoringSystem.lab8.streamProcessing;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Tydzień 9, Programowanie funkcyjne, przykład przetwarzania strumieni danych z czujników
public class StreamProcessingExample {
    public static void main(String[] args) {
        List<Double> temperaturesInCelsius = List.of(20.0, 25.0, 30.0, 35.0, 40.0, 45.0);
        Map<String, List<Double>> temperatureData = Map.of(
                "Warsaw", List.of(20.0, 25.0, 30.0),
                "Egypt", List.of(35.0, 40.0, 45.0)
        );
        ArrayList<Double> pressureInHpa = new ArrayList<>(List.of(1000.0, 995.0, 1010.0, 1020.0, 1030.0, 1040.0, 990.0));

        double celciusToFarenheitFactor = 9.0 / 5.0;
        double celciusToFarenheitOffset = 32.0;

        List<Double> temperaturesInFahrenheit = temperaturesInCelsius.stream()
                .map(celsius -> celsius * celciusToFarenheitFactor + celciusToFarenheitOffset)
                .toList();

        System.out.println("-> Temperatures in Celsius:");
        temperaturesInCelsius.forEach(System.out::println);
        System.out.println("-> Temperatures in Fahrenheit:");
        temperaturesInFahrenheit.forEach(System.out::println);

        System.out.println("---------------------------------------------------");

        double elseValue = 0.0;
        Map<String, Double> averageTemperatures = temperatureData.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> entry.getValue().stream()
                                .mapToDouble(Double::doubleValue)
                                .average()
                                .orElse(elseValue)
                ));

        System.out.println("All temperatures in cities");
        temperatureData.forEach((city, temps) -> { System.out.println(city + ": " + temps); });
        System.out.println("Average temperautres in cities");
        averageTemperatures.forEach((city, avgTemp) -> System.out.println(city + ": " + avgTemp));

        System.out.println("---------------------------------------------------");

        double pressureThreshold = 1000.0;

        List<Double> filteredPressure = pressureInHpa.stream()
                .filter(pressure -> pressure > pressureThreshold)
                .toList();

        System.out.println("All pressure in hPa");
        pressureInHpa.forEach(System.out::println);
        System.out.println("Filtered pressure in hPa");
        filteredPressure.forEach(System.out::println);
    }
}
