package com.jnsdev.booklabs.repository;

import com.jnsdev.booklabs.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @Autor Jairo Nascimento
 * @Created 25/06/2023 - 10:43
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Long>, JpaSpecificationExecutor<Book> {
}
