package com.jmendiola.bookstore.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "book", schema = "book_store_test")

public class Book implements Serializable
{
    public Book() {}

    public Book(int book_id, Author author, int isbn, String publish_date, String title, int price)
    {
        this.book_id = book_id;
        this.author = author;
        this.isbn = isbn;
        this.publish_date = publish_date;
        this.title = title;
        this.price = price;
    }

    @Id
    @Column(name = "book_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int book_id;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "author_id",insertable = false, updatable = false)
    private Author author;
    @Column(name = "isbn")
    private int isbn;
    @Column(name = "publish_date")
    private String publish_date;
    @Column(name = "title")
    private String title;
    @Column(name = "price")
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

    public void setBook_id(int book_id)
    {
        this.book_id = book_id;
    }

    public void setAuthor(Author author)
    {
        this.author = author;
    }

    public void setIsbn(int isbn)
    {
        this.isbn = isbn;
    }

    public void setPublish_date(String publish_date)
    {
        this.publish_date = publish_date;
    }

    public Author getAuthor()
    {
        return author;
    }

    public String getTitle()
    {
        return title;
    }

    public int getPrice()
    {
        return price;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }
}
