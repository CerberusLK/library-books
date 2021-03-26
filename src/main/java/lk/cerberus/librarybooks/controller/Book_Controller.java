package lk.cerberus.librarybooks.controller;

import lk.cerberus.librarybooks.entity.Book;
import lk.cerberus.librarybooks.repository.Book_Repository;
import lk.cerberus.librarybooks.service.Book_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class Book_Controller {

    @Autowired
    private Book_Service bookService;
    @Autowired
    private Book_Repository bookRepository;

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping(path = "/{isbn}")
    public Optional<Book> getBookByISBN(@PathVariable(value = "isbn") String isbn) {
        return bookService.getBookByISBN(isbn);
    }

    @PostMapping
    public void addBook(@RequestBody Book book) {
        bookService.addBook(book);
    }

    @PutMapping(path = "/{isbn}")
    public void updateBook(@PathVariable(value = "isbn") String isbn, @RequestBody Book book) {
        bookService.updateBook(isbn, book);
    }

    @DeleteMapping(path = "/{isbn}")
    public void deleteBook(String isbn) {
        bookService.deleteBook(isbn);
    }

    @RequestMapping(path = "/search/{bookTitle}")
    public List<Book> getBookByTitle(@PathVariable(value = "bookTitle") String bookTitle){
        return bookService.getBookByTitle(bookTitle);
    }

}
