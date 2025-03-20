package net.javaguides.lms.service;

import net.javaguides.lms.entity.Book;
import net.javaguides.lms.entity.Author;
import net.javaguides.lms.entity.Category;
import net.javaguides.lms.repository.AuthorRepository;
import net.javaguides.lms.repository.BookRepository;
import net.javaguides.lms.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    private final CategoryRepository categoryRepository;

    @Autowired
    public BookService(BookRepository bookRepository, AuthorRepository authorRepository, CategoryRepository categoryRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
        this.categoryRepository = categoryRepository;
    }

    // Retrieve all books
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // Retrieve a book by ID
    public Book getBookById(Long id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Book not found with ID: " + id));
    }

    // Create a new book
    public Book createBook(Book book) {
        validateAuthorAndCategory(book);
        return bookRepository.save(book);
    }

    // Update an existing book
    public Book updateBook(Long id, Book updatedBook) {
        Book existingBook = bookRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Book not found with ID: " + id));

        // Update book fields
        existingBook.setTitle(updatedBook.getTitle());

        // Update associations
        if (updatedBook.getAuthor() != null) {
            Author author = authorRepository.findById(updatedBook.getAuthor().getId())
                    .orElseThrow(() -> new IllegalArgumentException("Author not found with ID: " + updatedBook.getAuthor().getId()));
            existingBook.setAuthor(author);
        }

        if (updatedBook.getCategory() != null) {
            Category category = categoryRepository.findById(updatedBook.getCategory().getId())
                    .orElseThrow(() -> new IllegalArgumentException("Category not found with ID: " + updatedBook.getCategory().getId()));
            existingBook.setCategory(category);
        }

        return bookRepository.save(existingBook);
    }

    // Delete a book
    public void deleteBook(Long id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Book not found with ID: " + id));
        bookRepository.delete(book);
    }

    // Validate that the associated author and category exist
    private void validateAuthorAndCategory(Book book) {
        if (book.getAuthor() != null) {
            authorRepository.findById(book.getAuthor().getId())
                    .orElseThrow(() -> new IllegalArgumentException("Author not found with ID: " + book.getAuthor().getId()));
        }
        if (book.getCategory() != null) {
            categoryRepository.findById(book.getCategory().getId())
                    .orElseThrow(() -> new IllegalArgumentException("Category not found with ID: " + book.getCategory().getId()));
        }
    }
}
