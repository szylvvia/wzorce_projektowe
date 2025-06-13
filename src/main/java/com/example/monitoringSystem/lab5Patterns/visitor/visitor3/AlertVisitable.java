//Tydzień 6, Wzorzec Visitor - interfejs elementu odwiedzanego dla alertów
//Definiuje kontrakt dla jednostek które mogą generować alerty
//Umożliwia visitorem tworzenie różnych typów raportów alarmowych
package com.example.monitoringSystem.lab5Patterns.visitor.visitor3;

interface AlertVisitable {
    String accept(AlertVisitor alertVisitor);
}

//Koniec, Tydzień 6, Wzorzec Visitor - interfejs alertów
