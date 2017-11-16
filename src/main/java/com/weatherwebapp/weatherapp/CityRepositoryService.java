package com.weatherwebapp.weatherapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class CityRepositoryService implements Repository {

    @Autowired
    CityRepository cityRepository;

    City Istanbul = new City();
    City Sakarya = new City();
    City Manisa = new City();

    @Override
    public void addCity() {
        Istanbul.setCityName("Istanbul");
        Istanbul.setCountryName("Turkey");

        cityRepository.save(Istanbul);

        Sakarya.setCityName("Sakarya");
        Sakarya.setCountryName("Turkey");

        cityRepository.save(Sakarya);

        Manisa.setCityName("Manisa");
        Manisa.setCountryName("Turkey");

        cityRepository.save(Manisa);

    }

}
