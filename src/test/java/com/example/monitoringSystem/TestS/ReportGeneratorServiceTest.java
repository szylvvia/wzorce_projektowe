package com.example.monitoringSystem.TestS;

import com.example.monitoringSystem.lab9.AspectJ3.ReportGeneratorService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ReportGeneratorServiceTest {

    @Test
    void testGenerateReportWithValidDate() {
        ReportGeneratorService service = new ReportGeneratorService();
        String report = service.generateReport("2023-10-01");
        assertTrue(report.contains("Report generated for date: 2023-10-01"), "Report should contain the correct date.");
    }

    @Test
    void testMeasurementsAreRoundedToTwoDecimalPlaces() {
        ReportGeneratorService service = new ReportGeneratorService();
        service.generateReport("2023-10-01");
        List<Double> measurements = service.dataMeasurements;
        for (Double measurement : measurements) {
            assertEquals(measurement, Math.round(measurement * 100) / 100.0, "Measurements should be rounded to two decimal places.");
        }
    }

    @Test
    void testMaximumNumberOfMeasurements() {
        ReportGeneratorService service = new ReportGeneratorService();
        service.generateReport("2023-10-01");
        assertEquals(3, service.dataMeasurements.size(), "There should be exactly 3 measurements.");
    }

    @Test
    void testArchiveReportClearsData() {
        ReportGeneratorService service = new ReportGeneratorService();
        service.generateReport("2023-10-01");
        service.archiveReport();
        assertTrue(service.dataMeasurements.isEmpty(), "Data measurements should be cleared after archiving.");
    }

    @Test
    void testMeasurmenrAreInRange() {
        ReportGeneratorService service = new ReportGeneratorService();
        service.generateReport("2023-10-01");
        for (Double measurement : service.dataMeasurements) {
            assertTrue(measurement >= 0 && measurement <= 100, "Measurements should be in the range of 0 to 100.");
        }
    }
}