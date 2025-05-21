package com.example.monitoringSystem.lab3Patterns.flyweight.flyweight2;

import com.example.monitoringSystem.lab3Patterns.flyweight.flyweight1.DigitalSensorTester;
import com.example.monitoringSystem.lab3Patterns.flyweight.flyweight1.EnvironmentalDetailsFactory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FinalReportTester {
    private List<FinalReport> finalReports = new ArrayList<>();

    public FinalReportTester()
    {
        int loopCount = 10;
        for(int i=0; i<loopCount; i++) {
            appendReportWithData(RepeatFlyReportDataFactory.ReportType.DAILY);
        }
        for(int i=0; i<loopCount; i++) {
            appendReportWithData(RepeatFlyReportDataFactory.ReportType.MONTHLY);
        }
        for(int i=0; i<loopCount; i++) {
            appendReportWithData(RepeatFlyReportDataFactory.ReportType.WEEKLY);
        }
    }
    private void appendReportWithData(RepeatFlyReportDataFactory.ReportType reportType){
        RepeatFlyReportData reportData = RepeatFlyReportDataFactory.getReportData(reportType);
        Date date = new Date();
        int randomRangeForValue2 = 10;
        int value2 = (int) (Math.random() * randomRangeForValue2);
        FinalReport finalReport = new FinalReport(date, "Author" + value2);
        finalReport.setRepeatFlyReportData(reportData);
        System.out.println(finalReport);
        finalReports.add(finalReport);
    }

    public static void main(String[] args) {
        System.out.println("--- Flyweight pattern 2 ---");
        FinalReportTester finalReportTester = new FinalReportTester();
    }

}
