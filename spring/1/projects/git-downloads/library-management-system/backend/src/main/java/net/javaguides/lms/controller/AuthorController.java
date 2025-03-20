package net.javaguides.lms.controller;

import net.javaguides.lms.entity.Author;
import net.javaguides.lms.entity.Book;
import net.javaguides.lms.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/authors")
public class AuthorController {

    private final AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping
    public ResponseEntity<List<Author>> getAllAuthors() {
        List<Author> authors = authorService.getAllAuthors();
        return ResponseEntity.ok(authors);
    }

    // Get all authors
    @GetMapping("/{id}")
    public ResponseEntity<Author> getAuthorById(@PathVariable Long id) {
        Optional<Author> author = authorService.getAuthorById(id);
        return author.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Create a new author
    @PostMapping
    public ResponseEntity<Author> createAuthor(@RequestBody Author author) {
        Author createdAuthor = authorService.createAuthor(author);
        return ResponseEntity.ok(createdAuthor);
    }

    // Update an existing author
    @PutMapping("/{id}")
    public ResponseEntity<Author> updateAuthor(@PathVariable Long id, @RequestBody Author updatedAuthor) {
        try {
            Author author = authorService.updateAuthor(id, updatedAuthor);
            return ResponseEntity.ok(author);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();
        }
    }

    // Delete an author
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAuthor(@PathVariable Long id) {
        try {
            authorService.deleteAuthor(id);
            return ResponseEntity.noContent().build();
        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();
        }
    }

    // Add a book to an author
    @PostMapping("/{authorId}/books")
    public ResponseEntity<Author> addBookToAuthor(@PathVariable Long authorId, @RequestBody Book book) {
        try {
            Author author = authorService.addBookToAuthor(authorId, book);
            return ResponseEntity.ok(author);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();
        }
    }

    // Remove a book from an author
    @DeleteMapping("/{authorId}/books/{bookId}")
    public ResponseEntity<Author> removeBookFromAuthor(@PathVariable Long authorId, @PathVariable Long bookId) {
        try {
            Author author = authorService.removeBookFromAuthor(authorId, bookId);
            return ResponseEntity.ok(author);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
