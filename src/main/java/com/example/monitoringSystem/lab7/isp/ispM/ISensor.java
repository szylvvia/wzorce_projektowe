package com.example.monitoringSystem.lab7.isp.ispM;

public interface ISensor {
    double readValue();
    void calibrate();
    void reset();
    void displayStatus();
}
