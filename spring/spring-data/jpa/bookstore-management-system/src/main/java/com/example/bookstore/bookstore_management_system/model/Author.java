package com.example.bookstore.bookstore_management_system.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id")  // Custom column name
    private Long id;

    @Column(name = "first_name", nullable = false)  // Custom column name and nullable constraint
    private String firstName;

    @Column(name = "last_name", nullable = false)  // Custom column name and nullable constraint
    private String lastName;

    @Column(name = "author_bio", length = 500)  // Custom column name and length constraint
    private String bio;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<Book> books;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBio() {
        return bio;
    }
    public void setBio(String bio) {
        this.bio = bio;
    }

    public List<Book> getBooks() {
        return books;
    }
    public void setBooks(List<Book> books) {
        this.books = books;
    }

}
