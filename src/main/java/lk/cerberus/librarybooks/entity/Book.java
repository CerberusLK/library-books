package lk.cerberus.librarybooks.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Book")
public class Book {

    @Id
    @Column(length = 13, unique = true, nullable = false)
    private String ISBN;

    @Column(name = "Book_Title")
    private String bookTitle;

    @Column(name = "Book_Column")
    private String bookCategory;

    @Column(name = "Book_Publisher")
    private String boolPublisher;

    @Column(name = "Book_Edition")
    private String bookEdition;

    @Column(name = "Number_of_Copies")
    private int numOfCopies;

    @Column(name = "Available_Copies")
    private int availableCopies;

    @Column(name = "Author_Id")
    private String authorId;

    public Book() {
    }

    public Book(String ISBN, String bookTitle, String bookCategory, String boolPublisher, String bookEdition, int numOfCopies, int availableCopies, String authorId) {
        this.ISBN = ISBN;
        this.bookTitle = bookTitle;
        this.bookCategory = bookCategory;
        this.boolPublisher = boolPublisher;
        this.bookEdition = bookEdition;
        this.numOfCopies = numOfCopies;
        this.availableCopies = availableCopies;
        this.authorId = authorId;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }

    public String getBoolPublisher() {
        return boolPublisher;
    }

    public void setBoolPublisher(String boolPublisher) {
        this.boolPublisher = boolPublisher;
    }

    public String getBookEdition() {
        return bookEdition;
    }

    public void setBookEdition(String bookEdition) {
        this.bookEdition = bookEdition;
    }

    public int getNumOfCopies() {
        return numOfCopies;
    }

    public void setNumOfCopies(int numOfCopies) {
        this.numOfCopies = numOfCopies;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }
}
