package com.jnsdev.booklabs.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Autor Jairo Nascimento
 * @Created 25/06/2023 - 10:40
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "book", schema = "public")
public class Book implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "title", nullable = false, length = 100)
    private String title;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "description")
    private String description;

    @Column(name = "page")
    private Integer page;

    @Column(name = "price")
    private BigDecimal price;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id", referencedColumnName = "id")
    private Author author;
}
