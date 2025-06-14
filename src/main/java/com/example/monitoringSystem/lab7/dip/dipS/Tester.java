//Tydzień 8, Zasada DIP - klasa testująca Dependency Inversion Principle
//Demonstruje odwrócenie zależności poprzez zależność od abstrakcji, nie konkretnych implementacji
//Testuje różne implementacje sensorów, raportów i statystyk zgodnie z zasadą DIP
package com.example.monitoringSystem.lab7.dip.dipS;

import com.example.monitoringSystem.lab7.dip.dipS.dip1.DIPSensorDevice;
import com.example.monitoringSystem.lab7.dip.dipS.dip1.ISensor;
import com.example.monitoringSystem.lab7.dip.dipS.dip1.MyDIPSensorDevice;
import com.example.monitoringSystem.lab7.dip.dipS.dip1.SensorDevice;
import com.example.monitoringSystem.lab7.dip.dipS.dip2.BasicReport;
import com.example.monitoringSystem.lab7.dip.dipS.dip2.DailyReportData;
import com.example.monitoringSystem.lab7.dip.dipS.dip2.ReportGenerator;
import com.example.monitoringSystem.lab7.dip.dipS.dip3.BasicStatistics;
import com.example.monitoringSystem.lab7.dip.dipS.dip3.StatisticData;
import com.example.monitoringSystem.lab7.dip.dipS.dip3.StatisticGenerator;
import com.example.monitoringSystem.lab7.dip.dipS.dip3.WeeklyData;

public class Tester {
    public static void main(String[] args) {
        ISensor sensor = new MyDIPSensorDevice();
        SensorDevice sensorDevice = new DIPSensorDevice(sensor);

        double sensorResolutionMin = 0.5;
        double sensorResolutionMax = 1.0;
        double sensorNegativeResolution = -0.5;

        try {
            sensorDevice.measure(sensorNegativeResolution);
        } catch (RuntimeException e) {
            System.out.println("Wystąpił błąd: " + e.getMessage());
        }

        try {
            sensorDevice.measure(sensorResolutionMin);
            sensorDevice.measure(sensorResolutionMax);
        } catch (RuntimeException e) {
            System.out.println("Wystąpił błąd: " + e.getMessage());
        }

        System.out.println("--------------------------------------------------------------");

        DailyReportData reportData = new DailyReportData();
        ReportGenerator reportGenerator = new BasicReport(reportData);

        try {
            reportGenerator.generateReport("Dzienny raport", "2023-10-01");
            reportGenerator.generateReport("Raport tygodniowy", "2023-10-07");
        } catch (RuntimeException e) {
            System.out.println("Wystąpił błąd: " + e.getMessage());
        }

        try {
            reportGenerator.generateReport("Raport tygodniowy", "2030-10-01");
        } catch (RuntimeException e) {
            System.out.println("Wystąpił błąd: " + e.getMessage());
        }

        try {
            reportGenerator.generateReport("", "2011-10-01");
        } catch (RuntimeException e) {
            System.out.println("Wystąpił błąd: " + e.getMessage());
        }

        System.out.println("--------------------------------------------------------------");

        StatisticData statisticData = new WeeklyData();
        StatisticGenerator stats = new BasicStatistics(statisticData);

        stats.generateStats();
        stats.generateStats();
    }
}
//Koniec, Tydzień 8, Zasada DIP
