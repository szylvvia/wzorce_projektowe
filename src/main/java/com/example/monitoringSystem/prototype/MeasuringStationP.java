package com.example.monitoringSystem.prototype;

public class MeasuringStationP implements Cloneable {
    private String name;
    private String localization;

    public MeasuringStationP(String name, String localization) {
        this.name = name;
        this.localization = localization;
    }

    // Clone method to implement the Prototype pattern
    @Override
    public MeasuringStationP clone() {
        try {
            return (MeasuringStationP) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning not supported", e);
        }
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setLocalization(String localization) {
        this.localization = localization;
    }

    public String getName() {
        return name;
    }

    public String getLocalization() {
        return localization;
    }


    @Override
    public String toString() {
        return "MeasuringStation{Name='" + name + "', Localization='" + localization + "'}";
    }

}


