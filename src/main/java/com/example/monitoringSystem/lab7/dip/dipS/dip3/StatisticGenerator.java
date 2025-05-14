package com.example.monitoringSystem.lab7.dip.dipS.dip3;

public abstract class StatisticGenerator {
    protected StatisticData statisticData;

    public StatisticGenerator(StatisticData statisticData) {
        this.statisticData = statisticData;
    }

    public abstract void generateStats();
}
