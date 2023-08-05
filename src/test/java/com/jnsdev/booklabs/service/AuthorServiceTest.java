package com.jnsdev.booklabs.service;

import com.jnsdev.booklabs.entities.Author;
import com.jnsdev.booklabs.repository.AuthorRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


/**
 * @Autor Jairo Nascimento
 * @Created 28/06/2023 - 08:31
 */
@SpringBootTest(classes = AuthorServiceImpl.class)
class AuthorServiceTest {

    @Autowired
    private AuthorServiceImpl authorService;

    @MockBean
    private AuthorRepository authorRepository;

    @DisplayName("Test Mock create Author")
    @Test
    public void deveCriarAuthor() {
        var author = new Author();
        author.setLastname("Fulano");
        author.setFirstname("de tal");

        var authorSave = author;
        authorSave.setId(1L);


        BDDMockito.given(authorRepository.save(author)).willReturn(authorSave);

        var result = authorService.create(author);

        Assertions.assertNotNull(result);

        Assertions.assertEquals(1l, result.getId());
    }

}