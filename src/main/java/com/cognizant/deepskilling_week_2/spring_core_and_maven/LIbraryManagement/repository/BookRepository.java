package com.cognizant.deepskilling_week_2.spring_core_and_maven.LIbraryManagement.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {

    public void displayService(){
        System.out.println("Displaying the repository");
    }
}
