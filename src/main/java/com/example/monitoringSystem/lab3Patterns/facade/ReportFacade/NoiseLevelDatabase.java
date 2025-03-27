package com.example.monitoringSystem.lab3Patterns.facade.ReportFacade;

public class NoiseLevelDatabase implements DatabaseService {
    @Override
    public String getData() {
        return "Noise Level: 55 dB";
    }
}
