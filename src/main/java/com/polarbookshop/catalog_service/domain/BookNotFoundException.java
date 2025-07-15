package com.polarbookshop.catalog_service.domain;

public class BookNotFoundException extends RuntimeException{
    public BookNotFoundException(String isbn) {
        super("The book with IsBN"+ isbn + "was not found.");
    }
}
