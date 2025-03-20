package com.example.bookstore.bookstore_management_system.service;

import com.example.bookstore.bookstore_management_system.model.Author;
import com.example.bookstore.bookstore_management_system.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    // Fetch all authors
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    // Create a new author
    public Author createAuthor(Author author) {
        return authorRepository.save(author);
    }

    // Find an author by ID
    public Author getAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    // Update an existing author
    public Author updateAuthor(Author author) {
        return authorRepository.save(author);
    }

    // Delete an author by ID
    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}
