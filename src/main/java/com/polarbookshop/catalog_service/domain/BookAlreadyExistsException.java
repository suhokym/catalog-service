package com.polarbookshop.catalog_service.domain;

public class BookAlreadyExistsException extends RuntimeException{
    public BookAlreadyExistsException(String isbn) {
        super("A boo with ISBN" + isbn + " already exists.");
    }
}
