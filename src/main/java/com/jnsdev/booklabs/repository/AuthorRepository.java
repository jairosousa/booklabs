package com.jnsdev.booklabs.repository;

import com.jnsdev.booklabs.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @Autor Jairo Nascimento
 * @Created 25/06/2023 - 10:42
 */
@Repository
public interface AuthorRepository extends JpaRepository<Author, Long>, JpaSpecificationExecutor<Author> {
}
