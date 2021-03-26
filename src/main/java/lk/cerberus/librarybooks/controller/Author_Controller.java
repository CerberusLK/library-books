package lk.cerberus.librarybooks.controller;

import lk.cerberus.librarybooks.entity.Author;
import lk.cerberus.librarybooks.repository.Author_Repository;
import lk.cerberus.librarybooks.service.Author_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/author")
public class Author_Controller {

    @Autowired
    private Author_Service authorService;
    @Autowired
    private Author_Repository authorRepository;

    @GetMapping
    public List<Author> getAllAuthors() {
        return authorService.getAllAuthors();
    }

    @GetMapping(path = "/{id}")
    public Optional<Author> getAuthorById(@PathVariable(value = "id") String id) {
        return authorService.getAuthorById(id);
    }

    @PostMapping
    public void addAuthor(@RequestBody Author author) {
        authorService.addAuthor(author);
    }

    @PutMapping(path = "/{id}")
    public void updateAuthor(@PathVariable(value = "id") String id, @RequestBody Author author) {
        authorService.updateAuthor(id, author);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteAuthor(String id) {
        authorService.deleteAuthor(id);
    }
}
