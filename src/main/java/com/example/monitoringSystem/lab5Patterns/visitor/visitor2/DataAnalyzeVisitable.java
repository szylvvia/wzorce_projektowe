//Tydzień 6, Wzorzec Visitor - interfejs elementu odwiedzanego do analizy danych
//Definiuje kontrakt dla elementów które mogą być analizowane przez visitor
//Umożliwia dodawanie nowych operacji analizy bez modyfikacji istniejących klas
package com.example.monitoringSystem.lab5Patterns.visitor.visitor2;

interface DataAnalyzeVisitable {
    String accept(DataAnalyzeVisitor dataAnalyzer);
}

//Koniec, Tydzień 6, Wzorzec Visitor - interfejs analizy danych
