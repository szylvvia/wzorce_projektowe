//Tydzień 8, Zasada ISP - interfejs dla eksportu do CSV
//Segregacja interfejsu - specjalistyczny interfejs tylko dla generowania CSV
//Zgodnie z ISP - klienci implementują tylko funkcjonalność CSV
package com.example.monitoringSystem.lab7.isp.ispM.IDataExporterFile;

public interface ICSVExportable {
    void exportToCSV();
}

//Koniec, Tydzień 8, Zasada ISP - interfejs CSV eksport
