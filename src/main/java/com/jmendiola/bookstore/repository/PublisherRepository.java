package com.jmendiola.bookstore.repository;

import com.jmendiola.bookstore.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Integer>
{

}
