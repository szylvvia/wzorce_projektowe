package com.example.monitoringSystem.lab7.dip.dipM;

public class ConsoleReportGenerator extends AbstractReportGenerator {
    @Override
    public void generateReport(double result) {
        System.out.println("Średnia z pomiarów: " + result);
    }
}