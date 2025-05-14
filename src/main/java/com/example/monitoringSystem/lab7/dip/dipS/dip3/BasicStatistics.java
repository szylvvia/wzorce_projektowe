package com.example.monitoringSystem.lab7.dip.dipS.dip3;

public class BasicStatistics extends StatisticGenerator {

    public BasicStatistics(StatisticData statisticData) {
        super(statisticData);
    }

    @Override
    public void generateStats() {
        double sumTemperature = 0;
        double sumHumidity = 0;

        for (double temp : statisticData.getTemperatureData()) {
            sumTemperature += temp;
        }
        for (double humidity : statisticData.getHumidityData()) {
            sumHumidity += humidity;
        }

        Double averageTemperature = (double) Math.round(sumTemperature / statisticData.getTemperatureData().size());
        Double averageHumidity = (double) Math.round(sumHumidity / statisticData.getHumidityData().size());

        System.out.println("Srednia temperatura: " + averageTemperature+" | Srednia wilgotnosc: " + averageHumidity);
    }
}
