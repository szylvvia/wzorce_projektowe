package com.example.monitoringSystem.lab1Patterns.singleton;

public class DataSourceSingletonStaticBlockInit {
    private static final DataSourceSingletonStaticBlockInit dataSourceInstance;

    private DataSourceSingletonStaticBlockInit() {}

    static {
        try {
            dataSourceInstance = new DataSourceSingletonStaticBlockInit();
        } catch (Exception e) {
            throw new RuntimeException("Błąd podczas tworzenia instancji DataSourceSingletonStaticBlockInit");
        }
    }

    public static DataSourceSingletonStaticBlockInit getInstance() {
        return dataSourceInstance;
    }
}
