package com.example.monitoringSystem.TestdipM;

import com.example.monitoringSystem.lab7.dip.dipM.ConsoleReportGenerator;
import org.junit.jupiter.api.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ConsoleReportGeneratorTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final ConsoleReportGenerator generator = new ConsoleReportGenerator();

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testReportOutputBasic() {
        generator.generateReport(5.5);
        assertTrue(outContent.toString().contains("Średnia z pomiarów: 5.5"));
    }

    @Test
    void testReportWithZero() {
        generator.generateReport(0.0);
        assertTrue(outContent.toString().contains("Średnia z pomiarów: 0.0"));
    }

    @Test
    void testReportWithNegative() {
        generator.generateReport(-12.3);
        assertTrue(outContent.toString().contains("Średnia z pomiarów: -12.3"));
    }

    @Test
    void testReportWithLargeNumber() {
        generator.generateReport(123456.789);
        assertTrue(outContent.toString().contains("Średnia z pomiarów: 123456.789"));
    }

    @Test
    void testReportExactMatch() {
        generator.generateReport(10.0);
        assertEquals("Średnia z pomiarów: 10.0" + System.lineSeparator(), outContent.toString());
    }
}

