package com.cognizant.deepskilling_week_2.springDataJpaWithHibernate.services;

import com.cognizant.deepskilling_week_2.springDataJpaWithHibernate.entities.Country;
import com.cognizant.deepskilling_week_2.springDataJpaWithHibernate.exceptions.CountryNotFoundException;
import com.cognizant.deepskilling_week_2.springDataJpaWithHibernate.repositories.CountryRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {
    private final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository){
        this.countryRepository = countryRepository;
    }

    public List<Country> getAllCountries(){
        return countryRepository.findAll();
    }

    @Transactional
    public Optional<Country> findCountryByCode(String countryCode){
        Optional<Country> country =  countryRepository.findById(countryCode);

        if(!country.isPresent()){
            throw new CountryNotFoundException();
        }

        return country;
    }

    @Transactional
    public void addCountry(Country country){
        countryRepository.save(country);
    }

    @Transactional
    public Country updateCountry(String countryCode, Country country){
        Optional<Country> optionalCountry = countryRepository.findById(countryCode);

        if(optionalCountry.isPresent()){
            Country existingCountry = optionalCountry.get();

            existingCountry.setCoCode(existingCountry.getCoCode());
            existingCountry.setCoName(existingCountry.getCoName());

            return countryRepository.save(existingCountry);
        }

        throw new CountryNotFoundException();
    }

    @Transactional
    public void deleteCountry(String countryCode){
        countryRepository.deleteById(countryCode);
    }

    //search by country name
    public List<Country> searchByCountry(String text){
        return countryRepository.findByCoNameContainingIgnoreCase(text);
    }

    //search by country name in ascending order
    public List<Country> searchByCountryInAscendingOrder(String text){
        return countryRepository.findByCoNameContainingIgnoreCaseOrderByCoNameAsc(text);
    }

    //search by startingLetter
    public List<Country> searchByStartingLetter(String letter){
        return countryRepository.findByCoNameStartingWithIgnoreCase(letter);
    }

}
