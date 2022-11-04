package com.jmendiola.bookstore.repository;

import com.jmendiola.bookstore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer>
{

}
