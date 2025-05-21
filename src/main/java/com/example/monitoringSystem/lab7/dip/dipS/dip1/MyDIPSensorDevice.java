package com.example.monitoringSystem.lab7.dip.dipS.dip1;

public class MyDIPSensorDevice implements ISensor {

    @Override
    public void readValue() {
        int randomValueRange = 100;
        double randomRoundValue = 100.0;
        double randomValue = Math.random() * randomValueRange;
        randomValue = Math.round(randomValue * randomRoundValue) / randomRoundValue;
        System.out.println("Pomiar wartosci..." + randomValue);
    }
}
