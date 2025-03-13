package com.example.monitoringSystem.protoype1;

class MeasuringStation implements Cloneable {
    private String name;
    private String localization;

    public MeasuringStation(String name, String localization) {
        this.name = name;
        this.localization = localization;
    }

    // Clone method to implement the Prototype pattern
    @Override
    public MeasuringStation clone() {
        try {
            return (MeasuringStation) super.clone();
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

    @Override
    public String toString() {
        return "MeasuringStation{Name='" + name + "', Localization='" + localization + "'}";
    }
}


