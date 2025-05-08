package com.example.monitoringSystem.lab7.LiskoM;

//public class MeasurementStation7 {
//
//    public static void main(String[] args) {
//        Sensor7 sensor = new TemperatureSensor7();
//        DataLogger7 logger = new FileLogger7();
//        AlertSystem7 alerter = new TemperatureAlertSystem7();
//
//        performMeasurement(sensor, logger, alerter);
//    }
//
//    public static void performMeasurement(Sensor7 sensor, DataLogger7 logger, AlertSystem7 alerter) {
//        double value = sensor.readValue();
//        logger.log(value);
//        alerter.checkAndAlert(value);
//    }
//}
public class MeasurementStation7 {
    public static void main(String[] args) {

        // 🟦 Najpierw używamy klas bazowych z "anonimowymi" implementacjami (symulacja bazowej logiki)
        Sensor7 baseSensor = new Sensor7() {
            @Override
            public double readValue() {
                return 10.0;
            }
        };

        DataLogger7 baseLogger = new DataLogger7() {
            @Override
            public void log(double value) {
                System.out.println("Loguję bazowo: " + value);
            }
        };

        AlertSystem7 baseAlert = new AlertSystem7() {
            @Override
            public void checkAndAlert(double value) {
                if (value > 50) {
                    System.out.println("Bazowy alert!");
                }
            }
        };

        System.out.println("=== [Test z klasami bazowymi] ===");
        performMeasurement(baseSensor, baseLogger, baseAlert);

        // 🟩 Teraz zamieniamy obiekty klas bazowych na pochodne
        Sensor7 tempSensor = new TemperatureSensor7();
        DataLogger7 fileLogger = new FileLogger7();
        AlertSystem7 tempAlert = new TemperatureAlertSystem7();

        System.out.println("\n=== [Test z klasami pochodnymi] ===");
        performMeasurement(tempSensor, fileLogger, tempAlert);
    }

    // Funkcja używa tylko typów bazowych
    public static void performMeasurement(Sensor7 sensor, DataLogger7 logger, AlertSystem7 alerter) {
        double value = sensor.readValue();
        logger.log(value);
        alerter.checkAndAlert(value);
    }
}