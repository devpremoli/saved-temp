package com.example.bookstore.bookstore_management_system.controller;

import com.example.bookstore.bookstore_management_system.model.Book;
import com.example.bookstore.bookstore_management_system.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public String getAllBooks(Model model) {
        List<Book> books = bookService.getAllBooks();
        model.addAttribute("books", books);
        return "books/list";  // Refers to Thymeleaf template
    }

    @GetMapping("/{id}")
    public String getBookById(@PathVariable Long id, Model model) {
        Book book = bookService.getBookById(id).orElseThrow(() -> new RuntimeException("Book not found"));
        model.addAttribute("book", book);
        return "books/view";
    }

    @GetMapping("/new")
    public String showCreateBookForm(Model model) {
        model.addAttribute("book", new Book());
        return "books/create";
    }

    @PostMapping
    public String createBook(@ModelAttribute Book book) {
        bookService.createBook(book);
        return "redirect:/books";
    }

    @GetMapping("/{id}/edit")
    public String showEditBookForm(@PathVariable Long id, Model model) {
        Book book = bookService.getBookById(id).orElseThrow(() -> new RuntimeException("Book not found"));
        model.addAttribute("book", book);
        return "books/edit";
    }

    @PostMapping("/{id}")
    public String updateBook(@PathVariable Long id, @ModelAttribute Book bookDetails) {
        bookService.updateBook(id, bookDetails);
        return "redirect:/books";
    }

    @PostMapping("/{id}/delete")
    public String deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
        return "redirect:/books";
    }
}
