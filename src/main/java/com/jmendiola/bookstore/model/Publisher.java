package com.jmendiola.bookstore.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "publisher")
public class Publisher implements Serializable
{

    public Publisher() {}

    public Publisher(int publisher_id, String city, String state, int postalCode, String phone, String email, String name, String street)
    {
        this.publisher_id = publisher_id;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.phone = phone;
        this.email = email;
        this.name = name;
        this.street = street;
    }

    @Id
    @Column(name = "publisher_id",  insertable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int publisher_id;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "postal_code")
    private int postalCode;
    @Column(name = "phone")
    private String phone;
    @Column(name = "email")
    private String email;
    @Column(name = "name")
    private String name;
    @Column(name = "street")
    private String street;

    public void setName(String name)
    {
        this.name = name;
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

    public int getPublisherId()
    {
        return publisher_id;
    }

    public int getPublisher_id()
    {
        return publisher_id;
    }
    public void setPublisher_id(int publisher_id)
    {
        this.publisher_id = publisher_id;
    }

    public String getName()
    {
        return name;
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
}
