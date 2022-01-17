package com.project.restapi.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
//@Table(name = "book")
public class Book {

    //id, name, isbn
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String name;

    @Column(length = 500, nullable = false)
    private String isbn;

    @Builder
    public Book(String name, String isbn) {
        this.name = name;
        this.isbn = isbn;
    }

}
