package com.jmendiola.bookstore.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "book", schema = "book_store_test")

public class Book implements Serializable
{
    @Id
    @Column(name = "book_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int book_id;

    private int isbn;
    private String publish_date;
    private int author_id;
    private String title;
    private int publisher_id;
    private int price;

    public int getBook_id()
    {
        return book_id;
    }

    public int getIsbn()
    {
        return isbn;
    }

    public String getPublish_date()
    {
        return publish_date;
    }

    public int getAuthor_id()
    {
        return author_id;
    }

    public String getTitle()
    {
        return title;
    }

    public int getPublisher_id()
    {
        return publisher_id;
    }

    public int getPrice()
    {
        return price;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setPublisher_id(int publisher_id)
    {
        this.publisher_id = publisher_id;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }
}
