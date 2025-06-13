package com.example.monitoringSystem.lab8.functional.example2;

//Tydzień 10, Functional Programming, Tester interfejsów funkcyjnych dla analizy warunków pogodowych
public class Tester {
    public static void main(String[] args) {
        double temperatureThreshold = 30.0;
        double humidityThreshold = 70.0;
        double windSpeedThreshold = 20.0;

        WeatherChecker weatherChecker = (temperature, humidity, windSpeed) -> {
            System.out.println("---> Checking weather conditions...");
            if (temperature > temperatureThreshold) {
                System.out.println("It's hot!");
            } else {
                System.out.println("It's not too hot.");
            }
            if (humidity > humidityThreshold) {
                System.out.println("It's humid!");
            } else {
                System.out.println("Humidity is normal.");
            }
            if (windSpeed > windSpeedThreshold) {
                System.out.println("It's windy!");
            } else {
                System.out.println("Wind speed is normal.");
            }
        };

        double temperatureHigh = 35.0;
        double humidityHigh = 80.0;
        double windSpeedHigh = 25.0;
        double temperatureLow = 20.0;
        double humidityLow = 50.0;
        double windSpeedLow = 10.0;

        weatherChecker.checkWeather(temperatureHigh, humidityHigh, windSpeedHigh);
        weatherChecker.checkWeather(temperatureLow, humidityLow, windSpeedLow);

        System.out.println("-------------------------------------------------");

        WindConverter windConverterFromMpsToKph = windSpeed -> {
            double conversionFactor = 3.6;
            return windSpeed * conversionFactor;
        };

        double windSpeedInMps = 10.0;
        double windSpeedInKph = windConverterFromMpsToKph.convertWindSpeed(windSpeedInMps);
        System.out.println("Wind speed in km/h: " + windSpeedInKph);

        System.out.println("-------------------------------------------------");

        DataReader temperatureReader = (name, resolution) -> {
            int temperatureRange = 100;
            double temperature = Math.random() * temperatureRange;
            System.out.println("Reading temperature from sensor " + name + " with " + resolution+ " resolution....");
            return temperature;
        };

        String sensorName = "TempSensor1";
        double resolution = 0.1;

        double temperature = temperatureReader.readData(sensorName, resolution);
        double roundingFactor = 100.0;
        temperature = Math.round(temperature * roundingFactor) / roundingFactor;
        System.out.println("Temperature reading: " + temperature + "°C");
    }

}
//Koniec, Tydzień 10, Functional Programming
