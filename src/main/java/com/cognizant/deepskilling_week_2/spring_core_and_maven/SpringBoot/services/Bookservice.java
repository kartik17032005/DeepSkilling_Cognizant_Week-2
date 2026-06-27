package com.cognizant.deepskilling_week_2.spring_core_and_maven.SpringBoot.services;

import com.cognizant.deepskilling_week_2.spring_core_and_maven.SpringBoot.entities.Book;
import com.cognizant.deepskilling_week_2.spring_core_and_maven.SpringBoot.repositories.Bookrepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Bookservice {
    private final Bookrepository bookRepository;

    public Bookservice(Bookrepository bookRepository){
        this.bookRepository = bookRepository;
    }

    //fetch
    public Optional<Book> getBookById(Long id){
        return bookRepository.findById(id);
    }

    //fetchAll
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    //CREATE
    public void createBook(Book book){
        bookRepository.save(book);
    }

    //update
    public Book update(Long id, Book udpateBook){
        Optional<Book> book = bookRepository.findById(id);

        if(book.isPresent()){
            Book existingBook = book.get();

            existingBook.setBookName(udpateBook.getBookName());
            existingBook.setAuthor(udpateBook.getAuthor());

            return bookRepository.save(existingBook);
        }
        return null;
    }

    //delete
    public void delete(Long id){
        bookRepository.deleteById(id);
    }
}
