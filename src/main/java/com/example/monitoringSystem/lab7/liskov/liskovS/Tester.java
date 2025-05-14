package com.example.monitoringSystem.lab7.liskov.liskovS;

import java.util.List;

public class Tester {
    public static void main(String[] args) {
        DailyReport dailyReport = new DailyReport("2023-10-01", "Jan Nowak");
        MonthlyReport monthlyReport = new MonthlyReport("2023-10", "Ala Kowalska");

        dailyReport.generateReport();
        generateReportAndSave(dailyReport);
        monthlyReport.generateReport();
        generateReportAndSave(monthlyReport);

        CostalCity costalCity = new CostalCity("Gdynia");
        IndustrialCity industrialCity = new IndustrialCity("Kraków");

        costalCity.updateWeather();
        updateWeatherInCity(costalCity);
        industrialCity.updateWeather();
        updateWeatherInCity(industrialCity);

        TemperatureStatistic temperatureStatistic = new TemperatureStatistic(List.of(25.0, 30.0, 28.0), 27.0);
        PressureStatistic pressureStatistic = new PressureStatistic(List.of(1010.0, 1020.0, 1030.0), 1025.0);

        temperatureStatistic.printMessageAboutStatistic();
        checkStatistic(temperatureStatistic);
        pressureStatistic.printMessageAboutStatistic();
        checkStatistic(pressureStatistic);

    }

    public static void generateReportAndSave(Report report) {
        report.generateReport();
        report.saveReport();
    }

    public static void checkStatistic(Statistic statistic) {
        statistic.printMessageAboutStatistic();
    }

    public static void updateWeatherInCity(City city) {
        city.updateWeather();
    }
}
