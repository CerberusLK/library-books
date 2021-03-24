package lk.cerberus.librarybooks.service;

import lk.cerberus.librarybooks.entity.Author;
import lk.cerberus.librarybooks.repository.Author_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class Author_Service {

    @Autowired
    private Author_Repository author_repository;

    public List<Author> getAllAuthors() {
        List<Author> authors = new ArrayList<>();
        author_repository.findAll().forEach(authors::add);
        return authors;
    }

    public Author addAuthor(Author author) {
        author_repository.save(author);
        return author;
    }

    public Optional<Author> getAuthorById(String id) {
        return author_repository.findById(id);
    }

    public void updateAuthor(String id, Author author) {
        author_repository.save(author);
    }

    public void deleteAuthor(String id) {
        author_repository.deleteById(id);
    }
}
