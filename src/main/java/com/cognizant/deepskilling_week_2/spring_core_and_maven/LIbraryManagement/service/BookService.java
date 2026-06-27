package com.cognizant.deepskilling_week_2.spring_core_and_maven.LIbraryManagement.service;

import com.cognizant.deepskilling_week_2.spring_core_and_maven.LIbraryManagement.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Default constructor for Setter Injection
    public BookService() {
        System.out.println("Default Constructor Executed");
    }

    // Constructor Injection
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Constructor Injection Executed");
    }

    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Setter Injection Executed");
    }

    public void displayService() {
        System.out.println("Book Service is working");
        bookRepository.displayService();
    }
}