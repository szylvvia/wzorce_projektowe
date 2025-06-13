//Tydzień 8, Zasada ISP - interfejs dla eksportu do PDF
//Segregacja interfejsu - specjalistyczny interfejs tylko dla generowania PDF
//Zgodnie z ISP - nie wymusza implementacji CSV czy upload do chmury
package com.example.monitoringSystem.lab7.isp.ispM.IDataExporterFile;

public interface IPDFExportable {
    void exportToPDF();
}

//Koniec, Tydzień 8, Zasada ISP - interfejs PDF eksport