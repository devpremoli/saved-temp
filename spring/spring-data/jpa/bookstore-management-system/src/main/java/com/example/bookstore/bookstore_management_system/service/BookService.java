package com.example.bookstore.bookstore_management_system.service;

import com.example.bookstore.bookstore_management_system.model.Book;
import com.example.bookstore.bookstore_management_system.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public Book updateBook(Long id, Book bookDetails) {
        Optional<Book> book = bookRepository.findById(id);
        if (book.isPresent()) {
            Book existingBook = book.get();
            existingBook.setTitle(bookDetails.getTitle());
            existingBook.setIsbn(bookDetails.getIsbn());
            existingBook.setPrice(bookDetails.getPrice());
            existingBook.setPublishedDate(bookDetails.getPublishedDate());
            existingBook.setAuthor(bookDetails.getAuthor());
            return bookRepository.save(existingBook);
        } else {
            throw new RuntimeException("Book not found");
        }
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
