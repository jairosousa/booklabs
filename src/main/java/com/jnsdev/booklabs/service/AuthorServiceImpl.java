package com.jnsdev.booklabs.service;

import com.jnsdev.booklabs.entities.Author;
import com.jnsdev.booklabs.repository.AuthorRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

/**
 * * Service Implementation for managing {@link Author}.
 *
 * @Autor Jairo Nascimento
 * @Created 25/06/2023 - 18:43
 */

@Service
@Transactional
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository repository;

    public AuthorServiceImpl(AuthorRepository repository) {
        this.repository = repository;
    }


    @Override
    public Author create(Author entity) {
        try {
            return repository.save(entity);

        } catch (Exception ex) {
            return null;
        }
    }

    @Override
    public Author update(Author entity) {
        try {
            return repository.saveAndFlush(entity);

        } catch (Exception ex) {
            return null;
        }
    }

    @Override
    public Author getOne(Long id) {
        try {
            return repository.findById(id).orElse(null);

        } catch (Exception ex) {
            return null;
        }
    }

    @Override
    public List<Author> getAll() {
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
    public Page<Author> findAllPaginate(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Page<Author> findAllSpecification(Specification<Author> specs, Pageable pageable) {
        return repository.findAll(specs, pageable);
    }
}
