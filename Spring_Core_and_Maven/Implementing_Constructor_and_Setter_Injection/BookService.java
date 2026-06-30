package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        System.out.println("Constructor Injection");
        this.bookRepository = bookRepository;
    }

    public void setBookRepository(BookRepository bookRepository) {
        System.out.println("Setter Injection");
        this.bookRepository = bookRepository;
    }

    public void displayService() {
        System.out.println("BookService Bean Created");
        bookRepository.displayRepository();
    }
}