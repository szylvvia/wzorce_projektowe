package com.example.monitoringSystem.lab6.ocpAbstract2;

import java.util.List;

public class OcpAbstractTester {
    public static void main(String[] args) {
        OcpCity city = new OcpCity();
        AglomerationCity agglomerationCity = new AglomerationCity("Trojmiasto", List.of("gdansk", "gdynia", "sopot"));
        MetropolisCity metropolisCity = new MetropolisCity("Warszawa", 1865000);
        AglomerationCity agglomerationCity2 = new AglomerationCity("Krakow", List.of("krakow", "wieliczka"));

        List<ACity> cityList = List.of(agglomerationCity, metropolisCity, agglomerationCity2);

        city.updateWeatherInAllCity(cityList);
        System.out.println("-------------------------------------------------");

        OcpStatistics statistics = new OcpStatistics();
        MathStatistics mathStatistics = new MathStatistics(55.0, 45.0);
        AnalyticalStatistics analyticalStatistics = new AnalyticalStatistics("Normal", 1.96, 0.05);
        AnalyticalStatistics analyticalStatistics2 = new AnalyticalStatistics("Kolmogorov", 1.96, 0.05);

        List<AStatistics> statisticsList = List.of(mathStatistics, analyticalStatistics, analyticalStatistics2);

        statistics.calculateAllStatistics(statisticsList);
        statistics.generateAllReports(statisticsList);
        System.out.println("-------------------------------------------------");

        OcpSensor sensor = new OcpSensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor(25.0, "T001");
        PressureSensor pressureSensor = new PressureSensor(1013.25, "Warszawa");
        TemperatureSensor temperatureSensor2 = new TemperatureSensor(30.0, "T002");

        List<ASensor> sensorList = List.of(temperatureSensor, pressureSensor, temperatureSensor2);

        sensor.measureAllSensors(sensorList);
        sensor.showAllMeasurements(sensorList);
        System.out.println("-------------------------------------------------");

    }
}
