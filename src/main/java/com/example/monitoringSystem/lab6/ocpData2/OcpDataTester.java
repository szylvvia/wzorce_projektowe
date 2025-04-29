package com.example.monitoringSystem.lab6.ocpData2;

import java.util.List;

public class OcpDataTester {
    public static void main(String[] args) {

        List<ICity> cities = List.of(
           new CapitalCity("Warszawa"),
           new CapitalCity("Budapest"),
           new CapitalCity("Praga"),
           new AglomerationCity("Trojmiasto"),
           new AglomerationCity("Kraków")
        );

        OcpCity ocpCity = new OcpCity();
        ocpCity.checkWeatherInAllCities(cities);

        System.out.println("-------------------------------------------------");

        List<ISensor> sensors = List.of(
            new GrassPollenSensor("W-001"),
            new GrassPollenSensor("B-009"),
            new GrassPollenSensor("P-542"),
            new AirQualitySensor("T-112"),
            new AirQualitySensor("K-002")
        );

        OcpSensor ocpSensor = new OcpSensor();
        ocpSensor.readMeasurementFromAllSensors(sensors);

        System.out.println("-------------------------------------------------");

        List<IReport> reports = List.of(
                new DailyReport("2023-10-01"),
                new DailyReport("2023-10-02"),
                new DailyReport("2023-10-03"),
                new DailyReport("2023-10-04"),
                new MonthlyReport("2023-10"),
                new MonthlyReport("2023-11")
        );

        OcpReport ocpReport = new OcpReport();
        ocpReport.generateAllReports(reports);
    }
}
