package com.example.monitoringSystem.singleton;

public class DataSourceSingletonInnerStaticClassInit {

    private DataSourceSingletonInnerStaticClassInit dataSourceInstance;

    private static class InnerStaticClassHelper{
        private static final DataSourceSingletonInnerStaticClassInit SINGLE_INSTANCE = new DataSourceSingletonInnerStaticClassInit();
    }

    public static DataSourceSingletonInnerStaticClassInit getInstance() {
        return InnerStaticClassHelper.SINGLE_INSTANCE;
    }
}
