package net.javaguides.lms.service;

import net.javaguides.lms.entity.Author;
import net.javaguides.lms.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.javaguides.lms.repository.AuthorRepository;
import net.javaguides.lms.repository.BookRepository;
import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    @Autowired
    public AuthorService(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;

    }

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public Optional<Author> getAuthorById(Long id) {
        return authorRepository.findById(id);
    }

    // Create a new author with associated books
    public Author createAuthor(Author author) {
        author.getBooks().forEach(book -> book.setAuthor(author));
        return authorRepository.save(author);
    }

    // Delete an author and remove all associated books
    public void deleteAuthor(Long id) {
        Author author = authorRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Author not found"));

        // orphanRemoval will automatically handle the removal of books
        authorRepository.delete(author);
    }

    // Update an existing author and manage books
    public Author updateAuthor(Long id, Author updatedAuthor) {
        Author existingAuthor = authorRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Author not found"));

        existingAuthor.setFirstName(updatedAuthor.getFirstName());
        existingAuthor.setLastName(updatedAuthor.getLastName());

        // Handle book associations
        List<Book> existingBooks = existingAuthor.getBooks();

        // Remove books no longer in the updated list
        existingBooks.removeIf(book ->
                updatedAuthor.getBooks().stream().noneMatch(updatedBook -> updatedBook.getId().equals(book.getId())));

        // Add or update books from the updated list
        updatedAuthor.getBooks().forEach(updatedBook -> {
            Optional<Book> existingBook = existingBooks.stream()
                    .filter(book -> book.getId().equals(updatedBook.getId()))
                    .findFirst();

            if (existingBook.isPresent()) {
                // Update existing book's properties
                existingBook.get().setTitle(updatedBook.getTitle());
            } else {
                // Add new book
                updatedBook.setAuthor(existingAuthor);
                existingBooks.add(updatedBook);
            }
        });

        return authorRepository.save(existingAuthor);
    }

    // Add a book to an existing author
    public Author addBookToAuthor(Long authorId, Book book) {
        Author author = authorRepository.findById(authorId)
                .orElseThrow(() -> new IllegalArgumentException("Author not found"));

        book.setAuthor(author);
        author.getBooks().add(book);

        bookRepository.save(book);
        return authorRepository.save(author);
    }

    // Remove a book from an existing author
    public Author removeBookFromAuthor(Long authorId, Long bookId) {
        Author author = authorRepository.findById(authorId)
                .orElseThrow(() -> new IllegalArgumentException("Author not found"));

        Book book = bookRepository.findById(bookId)
                .orElseThrow(() -> new IllegalArgumentException("Book not found"));

        if (author.getBooks().contains(book)) {
            author.getBooks().remove(book);
            book.setAuthor(null);
            bookRepository.save(book); // Persist changes for the book
        }

        return authorRepository.save(author);
    }
}
