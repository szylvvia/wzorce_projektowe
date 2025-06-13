//Tydzień 7, Zasada OCP (Open/Closed Principle), zarządzanie generowaniem raportów
//Polimorficznie obsługuje różne typy raportów bez znajomości ich konkretnych implementacji
//System otwarty na rozszerzenia o nowe raporty, zamknięty na modyfikacje kodu zarządzającego
package com.example.monitoringSystem.lab6.ocpData2;

import java.util.List;

public class OcpReport {
    public void generateAllReports(List<IReport> reports) {
        for (IReport report : reports) {
            report.generateReport();
        }
    }
}
//Koniec, Tydzień 7, Zasada OCP - zarządzanie raportami
