package com.example.monitoringSystem.lab3Patterns.facade.ReportFacade;

//Tydzień 4, Wzorzec Facade 1
//Facade pattern dla generowania raportów środowiskowych - upraszcza dostęp do złożonego systemu
//Ukrywa skomplikowane operacje zbierania danych z różnych źródeł i generowania raportów
public class ReportFacade {
    private final DatabaseService airQualityDatabase;
    private final DatabaseService temperatureDatabase;
    private final DatabaseService noiseLevelDatabase;
    private final ReportGeneratorFacade reportGenerator;

    public ReportFacade(ReportGeneratorFacade reportGenerator) {
        this.airQualityDatabase = new AirQualityDatabase();
        this.temperatureDatabase = new TemperatureDatabase();
        this.noiseLevelDatabase = new NoiseLevelDatabase();
        this.reportGenerator = reportGenerator;
    }

    public String generateEnvironmentalReport() {
        // Pobieramy dane z trzech różnych źródeł
        String airQualityData = airQualityDatabase.getData();
        String temperatureData = temperatureDatabase.getData();
        String noiseLevelData = noiseLevelDatabase.getData();

        // Łączymy dane w jeden, spójny raport
        String combinedData = "Environmental Data Report:\n" +
                "Air Quality: " + airQualityData + "\n" +
                "Temperature: " + temperatureData + "\n" +
                "Noise Level: " + noiseLevelData;        // Używamy generatora raportów do przetworzenia połączonych danych
        return reportGenerator.generateReport(combinedData);
    }
}
//Koniec, Tydzień 4, Wzorzec Facade 1
