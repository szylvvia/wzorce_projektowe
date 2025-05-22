package com.example.monitoringSystem.TestispM;

import com.example.monitoringSystem.lab7.isp.ispM.CSVLogger;
import org.junit.jupiter.api.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CSVLoggerTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final CSVLogger logger = new CSVLogger();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    void testExportToCSVPrintsCorrectMessage() {
        logger.exportToCSV();
        assertEquals("Eksport do CSV..." + System.lineSeparator(), outContent.toString());
    }

    @Test
    void testOutputIsNotEmpty() {
        logger.exportToCSV();
        assertFalse(outContent.toString().isEmpty());
    }

    @Test
    void testOutputContainsKeyword() {
        logger.exportToCSV();
        assertTrue(outContent.toString().contains("CSV"));
    }

    @Test
    void testMultipleCalls() {
        logger.exportToCSV();
        logger.exportToCSV();
        assertEquals("Eksport do CSV..." + System.lineSeparator() + "Eksport do CSV..." + System.lineSeparator(), outContent.toString());
    }

    @Test
    void testNoExceptionThrown() {
        assertDoesNotThrow(() -> logger.exportToCSV());
    }
}

