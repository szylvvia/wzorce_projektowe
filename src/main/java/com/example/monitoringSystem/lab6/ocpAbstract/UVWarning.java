package com.example.monitoringSystem.lab6.ocpAbstract;

//Tydzień 7, Zasada OCP (Open/Closed Principle), implementacja ostrzeżenia o promieniowaniu UV
//Rozszerza system ostrzeżeń środowiskowych bez modyfikacji istniejących klas
//Pokazuje jak zasada OCP umożliwia dodawanie nowych typów monitoringu
public class UVWarning implements EnvironmentalWarning {
    @Override
    public void checkWarning() {
        System.out.println("Checking UV index warning...");
    }
}
//Koniec, Tydzień 7, Zasada OCP - ostrzeżenie UV
