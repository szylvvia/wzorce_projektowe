package com.example.monitoringSystem.singleton;

public class DataSourceSingletonEagerInit {

    private static final DataSourceSingletonEagerInit dataSourceInstance = new DataSourceSingletonEagerInit();

    private DataSourceSingletonEagerInit() {
    }

    public static DataSourceSingletonEagerInit getInstance() {
        return dataSourceInstance;
    }
}
