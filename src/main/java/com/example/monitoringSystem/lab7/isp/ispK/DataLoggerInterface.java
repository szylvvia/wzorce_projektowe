package com.example.monitoringSystem.lab7.isp.ispK;

public interface DataLoggerInterface {
    void logToDatabase(String data);
    void logToFile(String data);
    void logToCloud(String data);
}
