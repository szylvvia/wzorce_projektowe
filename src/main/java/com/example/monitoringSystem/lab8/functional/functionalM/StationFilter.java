package com.example.monitoringSystem.lab8.functional.functionalM;

@FunctionalInterface
interface StationFilter {
    boolean shouldInclude(String stationName);
}
