package com.example.monitoringSystem.lab9.AspectJ3;

//Tydzień 11, AOP - serwis generowania raportów z aspektami
//Klasa biznesowa odpowiedzialna za tworzenie różnych typów raportów
//Aspekty automatycznie dodają monitoring, walidację i pomiar wydajności
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;

//Tydzień 11, AspectJ AOP, Serwis generowania raportów z aspektami
@Service
public class ReportGeneratorService {

    final int MAX_MEASUREMENTS = 3;
    public List<Double> dataMeasurements = new ArrayList<>();

    public String generateReport(String date) {
        for (int i = 0; i < MAX_MEASUREMENTS; i++) {
            dataMeasurements.add(Math.round(Math.random() * 100)/100.0);
        }
        System.out.println("Generating report with data: " + date + " - Measurements: " + dataMeasurements);
        return "Report generated for date: " + date + " with measurements: " + dataMeasurements;
    }

    public void sendReport() {
        System.out.println("Sending report to the monitoring system.");
    }

    public void archiveReport() {
        System.out.println("Archiving report with data: " + dataMeasurements);
        dataMeasurements.clear();        System.out.println("Report archived and data cleared.");
    }
}
//Koniec, Tydzień 11, AOP - serwis generowania raportów
