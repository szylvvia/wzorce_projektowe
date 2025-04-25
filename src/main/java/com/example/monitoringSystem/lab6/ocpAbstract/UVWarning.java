package com.example.monitoringSystem.lab6.ocpAbstract;

public class UVWarning implements EnvironmentalWarning {
    @Override
    public void checkWarning() {
        System.out.println("Checking UV index warning...");
    }
}
