package com.example.monitoringSystem.lab7.dip.dipS.dip1;

public class MyDIPSensorDevice implements ISensor {

    @Override
    public void readValue() {
        double randomValue = Math.random() * 100;
        randomValue = Math.round(randomValue * 100.0) / 100.0;
        System.out.println("Pomiar wartosci..." + randomValue);
    }
}
