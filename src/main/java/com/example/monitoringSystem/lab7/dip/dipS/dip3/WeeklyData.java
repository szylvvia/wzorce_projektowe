package com.example.monitoringSystem.lab7.dip.dipS.dip3;

import java.util.ArrayList;
import java.util.List;

public class WeeklyData implements StatisticData {

    @Override
    public List<Double> getTemperatureData() {
        List<Double> data = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            data.add(i, (double) Math.round(Math.random() * 100));
        }
        return data;
    }

    @Override
    public List<Double> getHumidityData() {
        List<Double> data = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            data.add(i, (double) Math.round(Math.random() * 100));
        }
        return data;
    }
}
