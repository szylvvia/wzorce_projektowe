package com.example.monitoringSystem.lab8.functional.example2;

@FunctionalInterface
public interface DataReader {
    Double readData(String sensorName, Double resolution);
}
