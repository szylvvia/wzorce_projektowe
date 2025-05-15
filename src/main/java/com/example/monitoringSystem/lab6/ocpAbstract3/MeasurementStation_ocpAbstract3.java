package com.example.monitoringSystem.lab6.ocpAbstract3;

public class MeasurementStation_ocpAbstract3 {

    public static void main(String[] args) {
        MeasurementCollector_ocpAbstract3 collector = new MeasurementCollector_ocpAbstract3();
        MeasurementLogger_ocpAbstract3 logger = new MeasurementLogger_ocpAbstract3();

        System.out.println("Symulacja stacji pomiarowej");

        for (int i = 0; i < 5; i++) {
            Measurement_ocpAbstract3 measurement = collector.collect();
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
