package com.michael.springbootcustomexception.controller;

import com.michael.springbootcustomexception.model.Book;
import com.michael.springbootcustomexception.service.BookService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/book")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @GetMapping("{id}")
    public Book getBook(@PathVariable("id") long id){

        return bookService.findBookById(id);
    }

    @GetMapping
    public List<Book> getBooks(){
        return bookService.findAllBooks();
    }

    @PostMapping
    public void saveBook(@RequestBody @Valid Book book){
        bookService.saveBook(book);
    }

}
