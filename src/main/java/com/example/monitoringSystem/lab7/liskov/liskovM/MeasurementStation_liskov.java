package com.example.monitoringSystem.lab7.liskov.liskovM;


public class MeasurementStation_liskov {
    public static void main(String[] args) {

        // klasy bazowe
        Sensor_liskov baseSensor = new Sensor_liskov() {
            @Override
            public double readValue() {
                return 60.0;
            }
        };

        DataLogger_liskov baseLogger = new DataLogger_liskov() {
            @Override
            public void log(double value) {
                System.out.println("Loguję bazowo: " + value);
            }
        };

        AlertSystem_liskov baseAlert = new AlertSystem_liskov() {
            @Override
            public void checkAndAlert(double value) {
                if (value > 50) {
                    System.out.println("Bazowy alert!");
                }
            }
        };

        System.out.println("=== [Test z klasami bazowymi] ===");
        performMeasurement(baseSensor, baseLogger, baseAlert);

        // 🟩 zamieniamy obiekty klas bazowych na pochodne
        Sensor_liskov tempSensor = new TemperatureSensorLiskov();
        DataLogger_liskov fileLogger = new FileLogger_liskov();
        AlertSystem_liskov tempAlert = new TemperatureAlertSystem_liskov();

        System.out.println("\n=== [Test z klasami pochodnymi] ===");
        performMeasurement(tempSensor, fileLogger, tempAlert);
    }

    // Funkcja używa tylko typów bazowych
    public static void performMeasurement(Sensor_liskov sensor, DataLogger_liskov logger, AlertSystem_liskov alerter) {
        double value = sensor.readValue();
        logger.log(value);
        alerter.checkAndAlert(value);
    }
}