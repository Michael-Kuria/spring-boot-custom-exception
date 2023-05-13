package com.michael.springbootcustomexception.service;

import com.michael.springbootcustomexception.exceptions.BookNotFoundException;
import com.michael.springbootcustomexception.model.Book;
import com.michael.springbootcustomexception.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public Book findBookById(long id){
        return bookRepository.findById(id).orElseThrow( () ->
                new BookNotFoundException(String.format("Book with id %d was not found",id))
        );
    }

    public List<Book> findAllBooks(){
       return bookRepository.findAll();
    }

    public void saveBook(Book book){
        bookRepository.save(book);
    }


}
