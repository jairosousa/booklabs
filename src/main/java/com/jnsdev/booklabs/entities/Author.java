package com.jnsdev.booklabs.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Autor Jairo Nascimento
 * @Created 25/06/2023 - 10:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "author", schema = "public")
public class Author implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "lastname", nullable = false, length = 100)
    private String lastname;

    @Column(name = "firstname", length = 255)
    private String firstname;
}
