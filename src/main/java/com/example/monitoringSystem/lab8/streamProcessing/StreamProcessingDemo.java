package com.example.monitoringSystem.lab8.streamProcessing;

import java.util.Arrays;
import java.util.List;

public class StreamProcessingDemo {
    public static void main(String[] args) {
        List<Double> temperatures = Arrays.asList(20.5, 22.1, 19.0, 35.6, 41.2);
        List<Double> humidities = Arrays.asList(50.0, 55.5, 45.3, 80.1, 70.0);
        List<String> stationNames = Arrays.asList("North", "East", "South", "West", "Central");

        // Filtruj i wypisz wysokie temperatury
        System.out.println("High temperatures (>30°C):");
        temperatures.stream()
                .filter(t -> t > 30)
                .forEach(System.out::println);

        // Oblicz średnią wilgotność
        double avgHumidity = humidities.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0);
        System.out.println("Average humidity: " + avgHumidity);

        // Zmapuj nazwy stacji na wielkie litery i wypisz
        System.out.println("Station names:");
        stationNames.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
