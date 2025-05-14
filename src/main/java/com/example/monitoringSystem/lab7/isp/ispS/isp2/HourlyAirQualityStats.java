package com.example.monitoringSystem.lab7.isp.ispS.isp2;

public class HourlyAirQualityStats implements AirQualityStats{
    @Override
    public void calculateAirQualityValue() {
        double airQualityValue = Math.random()*10;
        System.out.println("Air Quality Value: " + Math.round(airQualityValue * 100.0) / 100.0);
    }

}
