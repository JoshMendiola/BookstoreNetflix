package com.jmendiola.bookstore.repository;

import com.jmendiola.bookstore.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Integer>
{
    List<Author> findByAuthors(int author_id);
}
