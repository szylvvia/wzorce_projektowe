package com.example.monitoringSystem.lab1Patterns.singleton;

//Tydzień 2, Wzorzec Singleton 1
//Eager initialization - obiekt jest tworzony podczas ładowania klasy
//Zapewnia jedną instancję DataSource w całej aplikacji
public class DataSourceSingletonEagerInit {

    private static final DataSourceSingletonEagerInit dataSourceInstance = new DataSourceSingletonEagerInit();

    private DataSourceSingletonEagerInit() {
    }    public static DataSourceSingletonEagerInit getInstance() {
        return dataSourceInstance;
    }
}
//Koniec, Tydzień 2, Wzorzec Singleton 1
