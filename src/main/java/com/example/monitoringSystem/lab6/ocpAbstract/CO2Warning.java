package com.example.monitoringSystem.lab6.ocpAbstract;

public class CO2Warning implements EnvironmentalWarning {
    @Override
    public void checkWarning() {
        System.out.println("Checking CO2 level warning...");
    }
}
