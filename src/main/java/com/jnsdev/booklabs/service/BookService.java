package com.jnsdev.booklabs.service;

import com.jnsdev.booklabs.entities.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

/**
 * Service Interface for managing {@link Book}.
 *
 * @Autor Jairo Nascimento
 * @Created 25/06/2023 - 18:34
 */
public interface BookService {

    /**
     * create new item for domain
     *
     * @param entity to save
     * @return persisted entity Book
     */
    Book create(Book entity);

    /**
     * Update entity. Check before if existing data. If data is empty throw Exception
     *
     * @param entity domain
     * @return Book
     */
    Book update(Book entity);

    /**
     * get Book by id. Can be return empty
     *
     * @param id the id of the entity.
     * @return Book
     */
    Book getOne(Long id);

    /**
     * Get all entities
     *
     * @return list of entities List<Book>
     */
    List<Book> getAll();

    /**
     * Count item in entity
     *
     * @return long
     */
    long getTotal();

    /**
     * Delete record by id
     */
    void delete(Long id);

    /**
     * Find all with pagination
     *
     * @return Page<Book>
     */
    Page<Book> findAllPaginate(Pageable pageable);

    /**
     * Find all with pagination  by criteria
     *
     * @return Page<Book>
     */
    Page<Book> findAllSpecification(Specification<Book> specs, Pageable pageable);
}
