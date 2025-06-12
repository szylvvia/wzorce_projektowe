package com.example.monitoringSystem.lab5Patterns.visitor.visitor1;

//Tydzień 6, Wzorzec Visitor, interfejs elementu akceptującego odwiedzającego w strukturze stacji
interface StationVisitable {
    String accept(StationVisitor visitor);
}
//Koniec, Tydzień 6, Wzorzec Visitor
