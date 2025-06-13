package com.example.monitoringSystem.lab8.streamProcessing;

import java.util.Arrays;
import java.util.List;

//Tydzień 10, Programowanie funkcyjne - zaawansowane przetwarzanie strumieni danych pomiarowych
//Stream API do analizy ciśnienia, prędkości wiatru i lokalizacji stacji
//Wykorzystanie operacji filter, map, max, count i sorted na strumieniach

public class AdvancedStreamProcessing {
    public static void main(String[] args) {
        List<Integer> pressureReadings = Arrays.asList(1012, 1008, 1005, 1002, 1010);
        List<Double> windSpeeds = Arrays.asList(5.4, 7.1, 3.8, 10.2, 6.6);
        List<String> locations = Arrays.asList("Delta", "Echo", "Foxtrot", "Golf", "Hotel");

        int zero = 0;
        double wind = 7.0;

        // Znajdź najwyższe ciśnienie
        int maxPressure = pressureReadings.stream()
                .max(Integer::compare)
                .orElse(zero);
        System.out.println("Max pressure: " + maxPressure + " hPa");

        // Zlicz dni z silnym wiatrem (> 7.0)
        long windyDays = windSpeeds.stream()
                .filter(ws -> ws > wind)
                .count();
        System.out.println("Number of windy days: " + windyDays);

        // Posortuj nazwy lokalizacji alfabetycznie i wypisz
        System.out.println("Sorted station names:");
        locations.stream()
                .sorted()
                .forEach(System.out::println);    }
}

//Koniec, Tydzień 10, Programowanie funkcyjne - stream processing
