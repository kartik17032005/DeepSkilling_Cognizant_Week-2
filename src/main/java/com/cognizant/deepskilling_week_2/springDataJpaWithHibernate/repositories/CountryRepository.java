package com.cognizant.deepskilling_week_2.springDataJpaWithHibernate.repositories;

import com.cognizant.deepskilling_week_2.springDataJpaWithHibernate.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

    List<Country> findByCoNameContainingIgnoreCase(String text);

    List<Country> findByCoNameContainingIgnoreCaseOrderByCoNameAsc(String text);

    List<Country> findByCoNameStartingWithIgnoreCase(String letter);
}
