package com.jnsdev.booklabs.service;

import com.jnsdev.booklabs.entities.Book;
import com.jnsdev.booklabs.repository.BookRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

/**
 * Service Implementation for managing {@link Book}.
 *
 * @Autor Jairo Nascimento
 * @Created 25/06/2023 - 18:49
 */
@Service
@Transactional
public class BookServiceImpl implements BookService {

    private final BookRepository repository;

    public BookServiceImpl(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public Book create(Book entity) {
        try {
            return repository.save(entity);

        } catch (Exception ex) {
            return null;
        }
    }

    @Override
    public Book update(Book entity) {
        try {
            return repository.saveAndFlush(entity);

        } catch (Exception ex) {
            return null;
        }
    }

    @Override
    public Book getOne(Long id) {
        try {
            return repository.findById(id).orElse(null);

        } catch (Exception ex) {
            return null;
        }
    }

    @Override
    public List<Book> getAll() {
        try {
            return repository.findAll();

        } catch (Exception ex) {
            return Collections.emptyList();
        }
    }

    @Override
    public long getTotal() {
        try {
            return repository.count();
        } catch (Exception ex) {
            return 0;
        }
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Page<Book> findAllPaginate(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Page<Book> findAllSpecification(Specification<Book> specs, Pageable pageable) {
        return repository.findAll(specs, pageable);
    }
}
