package com.example.monitoringSystem.lab7.dip.dipM;

public class FileDataSource extends AbstractDataSource {
    @Override
    public double[] fetchData() {
        return new double[] {22.5, 33.1, 21.8};  // dummy file read
    }
}