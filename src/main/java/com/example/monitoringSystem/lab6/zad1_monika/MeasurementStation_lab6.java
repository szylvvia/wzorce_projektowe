package com.example.monitoringSystem.lab6.zad1_monika;

public class MeasurementStation_lab6 {

    public static void main(String[] args) {
        MeasurementCollector_lab6 collector = new MeasurementCollector_lab6();
        MeasurementLogger_lab6 logger = new MeasurementLogger_lab6();

        System.out.println("Symulacja stacji pomiarowej");

        for (int i = 0; i < 5; i++) {
            Measurement_lab6 measurement = collector.collect();
            System.out.println("Zebrano pomiar: " + measurement);
            logger.log(measurement);

            try {
                Thread.sleep(1000); // 1s przerwy między pomiarami
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Zakończono zbieranie danych. Sprawdź log.txt.");
    }
}
