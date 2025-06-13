//Tydzień 8, Zasada ISP - logger CSV implementujący tylko potrzebne interfejsy
//Implementuje tylko ICSVExportable zgodnie z ISP
//Nie jest obciążony metodami dla PDF czy upload do chmury
package com.example.monitoringSystem.lab7.isp.ispM;

import com.example.monitoringSystem.lab7.isp.ispM.IDataExporterFile.ICSVExportable;

public class CSVLogger implements ICSVExportable {
    @Override
    public void exportToCSV() {
        System.out.println("Eksport do CSV...");
    }
}

//Koniec, Tydzień 8, Zasada ISP - logger CSV