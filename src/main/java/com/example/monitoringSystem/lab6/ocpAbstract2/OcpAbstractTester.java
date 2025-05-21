package com.example.monitoringSystem.lab6.ocpAbstract2;

import java.util.List;

public class OcpAbstractTester {
    public static void main(String[] args) {
        OcpCity city = new OcpCity();
        int populationOfWarsaw = 1865000;
        AglomerationCity agglomerationCity = new AglomerationCity("Trojmiasto", List.of("gdansk", "gdynia", "sopot"));
        MetropolisCity metropolisCity = new MetropolisCity("Warszawa", populationOfWarsaw);
        AglomerationCity agglomerationCity2 = new AglomerationCity("Krakow", List.of("krakow", "wieliczka"));

        List<ACity> cityList = List.of(agglomerationCity, metropolisCity, agglomerationCity2);

        city.updateWeatherInAllCity(cityList);
        System.out.println("-------------------------------------------------");

        OcpStatistics statistics = new OcpStatistics();
        double meanForMathStatistics = 55.0;
        double medianForMathStatistics = 45.0;
        MathStatistics mathStatistics = new MathStatistics(meanForMathStatistics, medianForMathStatistics);

        double tStudentValueForAnalyticalStatisticsNormal = 1.96;
        double zScoreValueForAnalyticalStatisticsNormal = 0.05;
        AnalyticalStatistics analyticalStatistics = new AnalyticalStatistics("Normal", tStudentValueForAnalyticalStatisticsNormal, zScoreValueForAnalyticalStatisticsNormal);

        double tStudentValueForAnalyticalStatisticsKolmogorov = 1.96;
        double zScoreValueForAnalyticalStatisticsKolmogorov = 0.05;
        AnalyticalStatistics analyticalStatistics2 = new AnalyticalStatistics("Kolmogorov", tStudentValueForAnalyticalStatisticsKolmogorov, zScoreValueForAnalyticalStatisticsKolmogorov);

        List<AStatistics> statisticsList = List.of(mathStatistics, analyticalStatistics, analyticalStatistics2);

        statistics.calculateAllStatistics(statisticsList);
        statistics.generateAllReports(statisticsList);
        System.out.println("-------------------------------------------------");

        OcpSensor sensor = new OcpSensor();
        double temperatureValueForSensor1 = 25.0;
        TemperatureSensor temperatureSensor = new TemperatureSensor(temperatureValueForSensor1, "T001");

        double pressureValue = 1013.25;
        PressureSensor pressureSensor = new PressureSensor(pressureValue, "Warszawa");

        double temperatureValueForSensor2 = 30.0;
        TemperatureSensor temperatureSensor2 = new TemperatureSensor(temperatureValueForSensor2, "T002");

        List<ASensor> sensorList = List.of(temperatureSensor, pressureSensor, temperatureSensor2);

        sensor.measureAllSensors(sensorList);
        sensor.showAllMeasurements(sensorList);
        System.out.println("-------------------------------------------------");

    }
}
