package com.example.monitoringSystem.lab7.liskov.liskovS;

import java.util.List;

//Tydzień 8, Zasada LSP 1
//Liskov Substitution Principle - obiekty klasy pochodnej mogą zastąpić obiekty klasy bazowej
//Wszystkie implementacje zachowują się zgodnie z kontraktem klasy bazowej
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

        double thresholdForTemperatureStatistic = 27.0;
        double thresholdForPressureStatistic = 1025.0;
        TemperatureStatistic temperatureStatistic = new TemperatureStatistic(List.of(25.0, 30.0, 28.0), thresholdForTemperatureStatistic);
        PressureStatistic pressureStatistic = new PressureStatistic(List.of(1010.0, 1020.0, 1030.0), thresholdForPressureStatistic);

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
    }    public static void updateWeatherInCity(City city) {
        city.updateWeather();
    }
}
//Koniec, Tydzień 8, Zasada LSP 1
