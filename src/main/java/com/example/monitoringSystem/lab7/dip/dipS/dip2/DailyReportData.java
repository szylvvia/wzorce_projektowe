package com.example.monitoringSystem.lab7.dip.dipS.dip2;

public class DailyReportData implements IReport {

    @Override
    public Double getDataToReport() {
        int randomValueRange = 100;
        return (double) Math.round(Math.random() * randomValueRange);
    }
}
