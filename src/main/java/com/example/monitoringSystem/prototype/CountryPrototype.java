package com.example.monitoringSystem.prototype;

import java.util.ArrayList;
import java.util.List;

public class CountryPrototype implements Cloneable {
    private List<City> listCities;

    public CountryPrototype(){
        listCities = new ArrayList<City>();
    }

    public CountryPrototype(List<City> listCities){
        this.listCities = listCities;
    }

    public void loadData(){
        listCities.add(new City("Warszawa", 1790658, true));
        listCities.add(new City("Kraków", 779115, false));
        listCities.add(new City("Łódź", 679941, false));
    }

    public List<City> getListCities() {
        return listCities;
    }


    @Override
    public Object clone() {
        List<City> temp = new ArrayList<City>();
        for(City city : listCities){
            temp.add(city);
        }
        return new CountryPrototype(temp);
    }

}
