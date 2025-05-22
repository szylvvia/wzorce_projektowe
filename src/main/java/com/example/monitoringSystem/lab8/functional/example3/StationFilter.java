package com.example.monitoringSystem.lab8.functional.example3;

@FunctionalInterface
interface StationFilter {
    boolean shouldInclude(String stationName);
}
