//Tydzień 13, Test jednostkowy dla FileDataSource (DIP)
//Testuje implementację źródła danych zgodnie z zasadą Dependency Inversion Principle
//Weryfikuje poprawność pobierania danych z pliku w kontekście wzorców SOLID
package com.example.monitoringSystem.TestdipM;

import com.example.monitoringSystem.lab7.dip.dipM.FileDataSource;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FileDataSourceTest {

    private final FileDataSource dataSource = new FileDataSource();

    @Test
    void testFetchDataLength() {
        double[] data = dataSource.fetchData();
        assertEquals(3, data.length);
    }

    @Test
    void testFetchDataFirstValue() {
        double[] data = dataSource.fetchData();
        assertEquals(22.5, data[0]);
    }

    @Test
    void testFetchDataSecondValue() {
        double[] data = dataSource.fetchData();
        assertEquals(33.1, data[1]);
    }

    @Test
    void testFetchDataThirdValue() {
        double[] data = dataSource.fetchData();
        assertEquals(21.8, data[2]);
    }

    @Test
    void testFetchDataNotNull() {
        assertNotNull(dataSource.fetchData());
    }
}
//Koniec, Tydzień 13, Test DIP FileDataSource
