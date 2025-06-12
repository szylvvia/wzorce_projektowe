package com.example.monitoringSystem.lab5Patterns.visitor.visitor1;

//Tydzień 6, Wzorzec Visitor, interfejs odwiedzającego definiujący operacje dla różnych typów stacji
interface StationVisitor {
    String visit(CityStation cityStation);
    String visit(ForestStation forestStation);
}
//Koniec, Tydzień 6, Wzorzec Visitor
