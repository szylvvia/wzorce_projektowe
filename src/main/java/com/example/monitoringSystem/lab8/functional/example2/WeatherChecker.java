package com.example.monitoringSystem.lab8.functional.example2;

@FunctionalInterface
public interface WeatherChecker {
    void checkWeather(Double temperature, Double humidity, Double windSpeed);
}
