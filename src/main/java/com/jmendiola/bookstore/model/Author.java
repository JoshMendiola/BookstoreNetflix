package com.jmendiola.bookstore.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "author", schema = "book_store_test")

public class Author implements Serializable
{
    @Id
    @Column(name = "author_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int author_id;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "artist_id")
    private Set<Author> authors = new HashSet<>();

    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private int postalCode;
    private String phone;
    private String email;

    public int getAuthor_id()
    {
        return author_id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getStreet()
    {
        return street;
    }

    public String getCity()
    {
        return city;
    }

    public String getState()
    {
        return state;
    }

    public int getPostalCode()
    {
        return postalCode;
    }

    public String getPhone()
    {
        return phone;
    }

    public String getEmail()
    {
        return email;
    }

    public void setStreet(String street)
    {
        this.street = street;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public void setPostalCode(int postalCode)
    {
        this.postalCode = postalCode;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAuthor_id(),getFirstName(),getLastName(),getStreet(),getCity(),getState(),getPostalCode(),getPhone(),getEmail());
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return getAuthor_id() == author.getAuthor_id();
    }
}
