package com.michael.springbootcustomexception.repository;

import com.michael.springbootcustomexception.model.Book;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends ListCrudRepository<Book, Long> {
}
