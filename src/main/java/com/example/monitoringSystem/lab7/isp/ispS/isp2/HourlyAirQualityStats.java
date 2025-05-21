package com.example.monitoringSystem.lab7.isp.ispS.isp2;

public class HourlyAirQualityStats implements AirQualityStats{
    @Override
    public void calculateAirQualityValue() {
        int airQualityRange = 10;
        double airQualityValue = Math.random()*airQualityRange;
        double roundingFactor = 100.0;
        System.out.println("Air Quality Value: " + Math.round(airQualityValue * roundingFactor) / roundingFactor);
    }

}
