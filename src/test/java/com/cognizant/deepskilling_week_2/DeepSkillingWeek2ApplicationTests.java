package com.cognizant.deepskilling_week_2;

import com.cognizant.deepskilling_week_2.springDataJpaWithHibernate.entities.Country;
import com.cognizant.deepskilling_week_2.springDataJpaWithHibernate.services.CountryService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@Slf4j
@SpringBootTest
class DeepSkillingWeek2ApplicationTests {

    @Autowired
    private CountryService countryService;

    @Test
    public void getAllCountriesTest() {
        log.info("Start");
        List<Country> countries = countryService.getAllCountries();
        log.info("Country: {}", countries);
        log.info("End");
    }

    @Test
    public void getCountryById() {
        log.info("Start");
        Optional<Country> country = countryService.findCountryByCode("IN");
        log.info("Country: {}", country);
        log.info("End");
    }

    @Test
    public void updateCountry() {
        log.info("Start");
        Country country = countryService.updateCountry("IN", new Country("US", "USA"));
        log.info("Country: {}", country);
        log.info("End");
    }

    @Test
    public void deleteCountry() {
        log.info("Start");
        countryService.deleteCountry("IN");
        log.info("Deleted");
        log.info("End");
    }

    @Test
    public void serchByCountryName(){
        log.info("Start");
        List<Country> countries = countryService.searchByCountry("ou");
        log.info("Countries with 'ou' are: {}", countries);
        log.info("End");
    }

    @Test
    public void serchByCountryNameInAscendingOrder(){
        log.info("Start");
        List<Country> countries = countryService.searchByCountryInAscendingOrder("ou");
        log.info("Countries with 'ou' are: {}", countries);
        log.info("End");
    }

    @Test
    public void searchByStartingLetter(){
        log.info("Start");
        List<Country> countries = countryService.searchByStartingLetter("Z");
        log.info("Countries with 'z' are: {}", countries);
        log.info("End");
    }

}
