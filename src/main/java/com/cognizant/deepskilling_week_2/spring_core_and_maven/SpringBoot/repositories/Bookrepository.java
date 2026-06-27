package com.cognizant.deepskilling_week_2.spring_core_and_maven.SpringBoot.repositories;

import com.cognizant.deepskilling_week_2.spring_core_and_maven.SpringBoot.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Bookrepository extends JpaRepository<Book, Long> {
}
