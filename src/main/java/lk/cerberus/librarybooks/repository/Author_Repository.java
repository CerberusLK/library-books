package lk.cerberus.librarybooks.repository;

import lk.cerberus.librarybooks.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Author_Repository extends CrudRepository<Author, String>, JpaRepository<Author, String> {

}
