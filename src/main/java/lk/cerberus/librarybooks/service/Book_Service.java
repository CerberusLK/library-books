package lk.cerberus.librarybooks.service;

import lk.cerberus.librarybooks.entity.Book;
import lk.cerberus.librarybooks.repository.Book_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class Book_Service {

    @Autowired
    public Book_Repository book_repository;

    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();
        book_repository.findAll().forEach(books::add);
        return books;
    }

    public Book addBook(Book book) {
        book_repository.save(book);
        return book;
    }

    public Optional<Book> getBookByISBN(String isbn) {
        return book_repository.findById(isbn);
    }

    public void updateBook(String isbn, Book book) {
        book_repository.save(book);
    }

    public void deleteBook(String isbn) {
        book_repository.deleteById(isbn);
    }
}
