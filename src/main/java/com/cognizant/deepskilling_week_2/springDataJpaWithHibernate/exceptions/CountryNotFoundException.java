package com.cognizant.deepskilling_week_2.springDataJpaWithHibernate.exceptions;

public class CountryNotFoundException extends RuntimeException{
    public CountryNotFoundException(){
        super("Country not found");
    }
}
