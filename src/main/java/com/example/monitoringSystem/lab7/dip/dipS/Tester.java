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

        sensorDevice.measure(sensorResolutionMin);
        sensorDevice.measure(sensorResolutionMax);

        System.out.println("--------------------------------------------------------------");

        DailyReportData reportData = new DailyReportData();
        ReportGenerator reportGenerator = new BasicReport(reportData);

        reportGenerator.generateReport("Dzienny raport", "2023-10-01");
        reportGenerator.generateReport("Raport tygodniowy", "2023-10-07");

        System.out.println("--------------------------------------------------------------");

        StatisticData statisticData = new WeeklyData();
        StatisticGenerator stats = new BasicStatistics(statisticData);

        stats.generateStats();
        stats.generateStats();
    }
}
