package com.example.monitoringSystem.lab7.dip.dipS.dip3;

import java.util.ArrayList;
import java.util.List;

public class WeeklyData implements StatisticData {

    @Override
    public List<Double> getTemperatureData() {
        return getDoubles();
    }

    @Override
    public List<Double> getHumidityData() {
        return getDoubles();
    }

    private List<Double> getDoubles() {
        List<Double> data = new ArrayList<>();
        int loopCount = 7;
        int randomValueRange = 100;
        for (int i = 0; i < loopCount; i++) {
            data.add(i, (double) Math.round(Math.random() * randomValueRange));
        }
        return data;
    }
}
