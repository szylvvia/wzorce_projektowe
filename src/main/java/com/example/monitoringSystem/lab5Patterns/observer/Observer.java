//Tydzień 6, Wzorzec Observer - interfejs obserwatora
//Definiuje kontrakt dla obiektów które chcą być powiadomione o zmianach
//Umożliwia luźne sprzężenie między obiektem obserwowanym a obserwatorami
package com.example.monitoringSystem.lab5Patterns.observer;

public interface Observer {
    void update(float temperature, float pressure, float humidity);
}
//Koniec, Tydzień 6, Wzorzec Observer - interfejs

