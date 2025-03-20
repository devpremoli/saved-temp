package com.example.bookstore.bookstore_management_system.controller;

import com.example.bookstore.bookstore_management_system.model.Author;
import com.example.bookstore.bookstore_management_system.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/authors")
public class AuthorController {

    private final AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping
    public String getAllAuthors(Model model) {
        List<Author> authors = authorService.getAllAuthors();
        model.addAttribute("authors", authors);
        return "authors/list";
    }

    @GetMapping("/{id}")
    public String viewAuthor(@PathVariable Long id, Model model) {
        Author author = authorService.getAuthorById(id);
        if (author != null) {
            model.addAttribute("author", author);
            return "authors/view"; // Make sure this points to your Thymeleaf view template (authors/view.html)
        } else {
            return "redirect:/authors"; // Redirect to the list if the author isn't found
        }
    }

    @GetMapping("/new")
    public String showCreateAuthorForm(Model model) {
        model.addAttribute("author", new Author());
        return "authors/create";
    }

    @PostMapping
    public String createAuthor(@ModelAttribute Author author) {
        authorService.createAuthor(author);
        return "redirect:/authors";
    }

    // Show the form for editing an existing author
    @GetMapping("/{id}/edit")
    public String showEditAuthorForm(@PathVariable Long id, Model model) {
        Author author = authorService.getAuthorById(id);
        if (author != null) {
            model.addAttribute("author", author);
            return "authors/edit";
        } else {
            return "redirect:/authors"; // If author not found, redirect to list
        }
    }

    // Handle form submission for updating an existing author
    @PostMapping("/{id}/edit")
    public String updateAuthor(@PathVariable Long id, @ModelAttribute Author author) {
        Author existingAuthor = authorService.getAuthorById(id);
        if (existingAuthor != null) {
            existingAuthor.setFirstName(author.getFirstName());
            existingAuthor.setLastName(author.getLastName());
            existingAuthor.setBio(author.getBio());
            authorService.updateAuthor(existingAuthor);
            return "redirect:/authors";
        } else {
            return "redirect:/authors"; // If author not found, redirect to list
        }
    }

    // Delete an author
    @PostMapping("/{id}/delete")
    public String deleteAuthor(@PathVariable Long id) {
        authorService.deleteAuthor(id);
        return "redirect:/authors";
    }
}
