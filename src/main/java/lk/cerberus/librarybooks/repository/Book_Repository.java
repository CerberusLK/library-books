package lk.cerberus.librarybooks.repository;

import lk.cerberus.librarybooks.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Book_Repository extends CrudRepository<Book, String>, JpaRepository<Book, String> {

}
