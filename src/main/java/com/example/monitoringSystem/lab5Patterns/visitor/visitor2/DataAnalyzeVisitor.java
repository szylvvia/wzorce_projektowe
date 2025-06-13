//Tydzień 6, Wzorzec Visitor - interfejs analizatora danych
//Definiuje operacje analizy dla różnych typów stacji pomiarowych
//Visitor umożliwia implementację różnych algorytmów analizy bez modyfikacji stacji
package com.example.monitoringSystem.lab5Patterns.visitor.visitor2;

interface DataAnalyzeVisitor {
    String accept(UrbanStation cityStation);
    String accept(SeaStation seaStation);
}

//Koniec, Tydzień 6, Wzorzec Visitor - interfejs analizatora
