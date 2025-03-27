package com.example.monitoringSystem.lab3Patterns.flyweight.flyweight2;

import java.util.Date;
import java.util.stream.Collectors;

public class FinalReport {
    private final Date DATE;
    private final String AUTHOR_ID;
    private RepeatFlyReportData repeatFlyReportData;

    public FinalReport(Date date, String autorId) {
        this.DATE = date;
        this.AUTHOR_ID = autorId;
    }

    public String getFinalReport() {
        return "Final report: " + DATE + " " + AUTHOR_ID;
    }

    public void setRepeatFlyReportData(RepeatFlyReportData repeatFlyReportData) {
        this.repeatFlyReportData = repeatFlyReportData;
    }

    @Override
    public String toString() {
        String mapAsString =  repeatFlyReportData.getReportDetails().entrySet().stream()
                .map(entry -> entry.getKey() + "=" + entry.getValue())
                .collect(Collectors.joining(", "));

        return getFinalReport() + " " + mapAsString;
    }




}
