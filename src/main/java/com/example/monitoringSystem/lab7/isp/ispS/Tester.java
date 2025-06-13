package com.example.monitoringSystem.lab7.isp.ispS;

//Tydzień 8, Zasada ISP - tester implementacji segregacji interfejsów
//Demonstruje zastosowanie Interface Segregation Principle w systemie monitoringu
//Pokazuje korzyści z podziału dużych interfejsów na mniejsze, specjalistyczne
import com.example.monitoringSystem.lab7.isp.ispS.isp1.BasicCSVReport;
import com.example.monitoringSystem.lab7.isp.ispS.isp1.BasicJSONReport;
import com.example.monitoringSystem.lab7.isp.ispS.isp1.BasicPDFReport;
import com.example.monitoringSystem.lab7.isp.ispS.isp2.DailyTemperatureStats;
import com.example.monitoringSystem.lab7.isp.ispS.isp2.HourlyAirQualityStats;
import com.example.monitoringSystem.lab7.isp.ispS.isp2.WeeklyNoisyLevelStats;
import com.example.monitoringSystem.lab7.isp.ispS.isp3.AdvancedAirStation;
import com.example.monitoringSystem.lab7.isp.ispS.isp3.AdvancedWaterStation;
import com.example.monitoringSystem.lab7.isp.ispS.isp3.BasicSoilStation;

//Tydzień 8, Zasada ISP 1
//Interface Segregation Principle - klienci nie powinni zależeć od interfejsów których nie używają
//Podział dużych interfejsów na mniejsze, bardziej specjalistyczne interfejsy
public class Tester {
    public static void main(String[] args) {
        BasicCSVReport basicCSVReport = new BasicCSVReport();
        basicCSVReport.generateCSVReport("Good weather data");

        BasicPDFReport basicPDFReport = new BasicPDFReport();
        basicPDFReport.generatePDFReport("Storm data");

        BasicJSONReport basicJSONReport = new BasicJSONReport();
        basicJSONReport.generateJSONReport("Rain data");

        System.out.println("---------------------------------------------------");

        DailyTemperatureStats dailyTemperatureStats = new DailyTemperatureStats();
        dailyTemperatureStats.calculateTemperatureValue();

        HourlyAirQualityStats hourlyAirQualityStats = new HourlyAirQualityStats();
        hourlyAirQualityStats.calculateAirQualityValue();

        WeeklyNoisyLevelStats weeklyNoisyLevelStats = new WeeklyNoisyLevelStats();
        weeklyNoisyLevelStats.calculateNoiseValue();

        System.out.println("---------------------------------------------------");

        AdvancedAirStation advancedAirStation = new AdvancedAirStation();
        advancedAirStation.turnOn();
        advancedAirStation.calibrate();
        advancedAirStation.monitorAirPollution();
        advancedAirStation.turnOff();

        AdvancedWaterStation advancedWaterStation = new AdvancedWaterStation();
        advancedWaterStation.turnOn();
        advancedWaterStation.calibrate();
        advancedWaterStation.monitorWaterQuality();
        advancedWaterStation.turnOff();

        BasicSoilStation basicSoilStation = new BasicSoilStation();
        basicSoilStation.turnOn();
        basicSoilStation.calibrate();
        basicSoilStation.monitorSoilHumidity();
        basicSoilStation.turnOff();        System.out.println("---------------------------------------------------");

    }
}
//Koniec, Tydzień 8, Zasada ISP - tester implementacji
