package com.cognizant.deepskilling_week_2.spring_core_and_maven.SpringBoot.controllers;

import com.cognizant.deepskilling_week_2.spring_core_and_maven.SpringBoot.entities.Book;
import com.cognizant.deepskilling_week_2.spring_core_and_maven.SpringBoot.services.Bookservice;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class BookController {
    private Bookservice bookService;

    public BookController(Bookservice bookService){
        this.bookService = bookService;
    }

    //get All books
    @GetMapping("/")
    public List<Book> getAllBooks(){
        return ResponseEntity.ok(bookService.getAllBooks()).getBody();
    }

    //get Book by id
    @GetMapping("/book/{id}")
    public Optional<Book> getBookById(@PathVariable Long id){
        return bookService.getBookById(id);
    }

    //create book
    @PostMapping("/")
    public void createBook(Book book){
        ResponseEntity.ok();
    }

    //delete book
    @DeleteMapping("/book/{id}")
    public void deleteBook(@PathVariable Long id){
        bookService.delete(id);
    }
}
