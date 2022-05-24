package com.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

    private String firstName;
    private String lastName;

    private  String country;

    private String favoriteLanguage;

    private String[] operatingSys;

    private LinkedHashMap<String, String> countryOptions;
    public Student(){
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("Ind" , "India");
        countryOptions.put("usa" , "U.S.A");
        countryOptions.put("uk" , "U.K");
        countryOptions.put("fr" , "France");
        countryOptions.put("Br" , "Brazil");
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public String[] getOperatingSys() {
        return operatingSys;
    }

    public void setOperatingSys(String[] operatingSys) {
        this.operatingSys = operatingSys;
    }
}
