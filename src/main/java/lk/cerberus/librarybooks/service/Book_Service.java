package lk.cerberus.librarybooks.service;

import lk.cerberus.librarybooks.entity.Author;
import lk.cerberus.librarybooks.entity.Book;
import lk.cerberus.librarybooks.repository.Book_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class Book_Service {

    private String authorId;

    @Autowired
    public Book_Repository book_repository;

    @Autowired
    private Author_Service authorService;

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

    public List<Book> getBookByTitle(String bookTitle) {
        List<Book> books = getAllBooks();
        List<Book> foundBooks = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            Book grabbedBook = books.get(i);
            if (grabbedBook.getBookTitle().equals(bookTitle)) {
                foundBooks.add(grabbedBook);
            }
        }
        return foundBooks;
    }

    public List<Book> getBookByAuthorId(String authorId) {
        List<Book> books = getAllBooks();
        List<Book> foundBooks = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            Book grabbedBook = books.get(i);
            if (grabbedBook.getAuthorId().equals(authorId)) {
                foundBooks.add(grabbedBook);
            }
        }
        return foundBooks;
    }

    public List<Book> getBooksByAuthor(String authorName) {
        List<Author> authors = authorService.getAllAuthors();
        List<Book> books = new ArrayList<>();
        for (Author author : authors) {
            if (author.getAuthorName().equals(authorName)) {
                authorId = author.getAuthorId();
                for (Book book : getBookByAuthorId(authorId)) {
                    books.add(book);
                }
            }
        }
        return books;
    }

    public List<Book> getBookByCategory(String category) {
        List<Book> books = getAllBooks();
        List<Book> foundBooks = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            Book grabbedBook = books.get(i);
            if (grabbedBook.getBookCategory().equals(category)) {
                foundBooks.add(grabbedBook);
            }
        }
        return foundBooks;
    }
}
