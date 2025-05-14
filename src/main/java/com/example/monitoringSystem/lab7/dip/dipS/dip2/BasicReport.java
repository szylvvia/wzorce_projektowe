package com.example.monitoringSystem.lab7.dip.dipS.dip2;

public class BasicReport extends ReportGenerator {

    public BasicReport(IReport report) {
        super(report);
    }

    @Override
    public void generateReport(String title, String date) {
        Double data = report.getDataToReport();
        System.out.println("Generating basic report...");
        System.out.println(title+" | "+date+" | wartosc: "+data);
    }
}
