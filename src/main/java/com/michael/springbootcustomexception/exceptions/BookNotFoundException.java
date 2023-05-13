package com.michael.springbootcustomexception.exceptions;


public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(String message){
        super(message);
    }

}
