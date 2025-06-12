package com.example.monitoringSystem.lab1Patterns.singleton;

//Tydzień 2, Wzorzec Singleton 3
//Inner static class initialization - lazy loading z thread safety
//Najefektywniejsza implementacja Singleton - obiekt tworzony dopiero przy pierwszym wywołaniu
public class DataSourceSingletonInnerStaticClassInit {

    private DataSourceSingletonInnerStaticClassInit dataSourceInstance;

    private static class InnerStaticClassHelper{
        private static final DataSourceSingletonInnerStaticClassInit SINGLE_INSTANCE = new DataSourceSingletonInnerStaticClassInit();
    }    public static DataSourceSingletonInnerStaticClassInit getInstance() {
        return InnerStaticClassHelper.SINGLE_INSTANCE;
    }
}
//Koniec, Tydzień 2, Wzorzec Singleton 3
