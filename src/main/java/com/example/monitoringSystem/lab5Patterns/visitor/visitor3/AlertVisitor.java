//Tydzień 6, Wzorzec Visitor - interfejs visitora dla alertów
//Definiuje operacje generowania alertów dla różnych jednostek terytorialnych
//Umożliwia implementację różnych strategii raportowania alertów
package com.example.monitoringSystem.lab5Patterns.visitor.visitor3;

interface AlertVisitor {
    String visit(Country countryStation);
    String visit(Department departmentStation);
}

//Koniec, Tydzień 6, Wzorzec Visitor - interfejs visitora alertów
