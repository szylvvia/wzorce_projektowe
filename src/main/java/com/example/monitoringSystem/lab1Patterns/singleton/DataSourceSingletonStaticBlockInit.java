package com.example.monitoringSystem.lab1Patterns.singleton;

//Tydzień 2, Wzorzec Singleton 2
//Static block initialization - inicjalizacja w bloku statycznym z obsługą wyjątków
//Umożliwia lepszą kontrolę nad procesem tworzenia instancji
public class DataSourceSingletonStaticBlockInit {
    private static final DataSourceSingletonStaticBlockInit dataSourceInstance;

    private DataSourceSingletonStaticBlockInit() {}

    static {
        try {
            dataSourceInstance = new DataSourceSingletonStaticBlockInit();
        } catch (Exception e) {
            throw new RuntimeException("Błąd podczas tworzenia instancji DataSourceSingletonStaticBlockInit");
        }
    }    public static DataSourceSingletonStaticBlockInit getInstance() {
        return dataSourceInstance;
    }
}
//Koniec, Tydzień 2, Wzorzec Singleton 2
