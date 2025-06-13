package com.example.monitoringSystem.lab3Patterns.flyweight.flyweight2;

import java.util.HashMap;

//Tydzień 4, Flyweight Pattern, Fabryka zarządzająca współdzieleniem instancji flyweight dla raportów
public class RepeatFlyReportDataFactory {
    private static final HashMap<ReportType, RepeatFlyReportData>
            reportDataSet = new HashMap<ReportType,RepeatFlyReportData>();

    public static RepeatFlyReportData getReportData(ReportType reportType) {
        RepeatFlyReportData reportDataImpl = reportDataSet.get(reportType);
        if (reportDataImpl == null) {
            if (reportType == ReportType.MONTHLY) {
                reportDataImpl = new RepeatFlyReportData("Monthly", "Monthly report contains data from one month");
            } else if (reportType == ReportType.WEEKLY) {
                reportDataImpl = new RepeatFlyReportData("Weekly", "Weekly report content data from one week");
            } else if (reportType == ReportType.DAILY) {
                reportDataImpl = new RepeatFlyReportData("Daily", "Daily report content data from one day");
            }
            reportDataSet.put(reportType, reportDataImpl);
        }
        return reportDataImpl;
    }

    public static enum ReportType {
        MONTHLY, WEEKLY, DAILY
    }

}
//Koniec, Tydzień 4, Flyweight Pattern
