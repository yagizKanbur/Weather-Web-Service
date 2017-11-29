package com.weatherwebapp.weatherapp;


import javax.persistence.*;


@Entity
public class City{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public City() {

    }

    private String cityName;

    private String countryName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
