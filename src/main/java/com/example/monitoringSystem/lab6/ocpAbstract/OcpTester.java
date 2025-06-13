//Tydzień 7, Zasada OCP (Open/Closed Principle), klasa testująca zastosowanie zasady OCP
//Demonstruje jak system jest otwarty na rozszerzenia ale zamknięty na modyfikacje
//Pokazuje polimorficzne wykorzystanie interfejsów dla różnych implementacji
package com.example.monitoringSystem.lab6.ocpAbstract;

import java.util.List;

public class OcpTester {
    public static void main(String[] args) {
        System.out.println("=== OCP Pattern Test ===");

        // Pomiar przez strategię
        MeasurementStrategy temp = new TemperatureMeasurement();
        MeasurementStrategy press = new PressureMeasurement();
        System.out.println(temp.performMeasurement());
        System.out.println(press.performMeasurement());

        // Logowanie przez interfejs
        DataLogger fileLogger = new FileLogger();
        DataLogger dbLogger = new DatabaseLogger();
        fileLogger.log("Temperature: 22.5");
        dbLogger.log("Pressure: 1013");

        List<EnvironmentalWarning> warnings = List.of(
                new CO2Warning(),
                new UVWarning()
        );

        for (EnvironmentalWarning warning : warnings) {
            warning.checkWarning();
        }

    }
}
//Koniec, Tydzień 7, Zasada OCP - tester