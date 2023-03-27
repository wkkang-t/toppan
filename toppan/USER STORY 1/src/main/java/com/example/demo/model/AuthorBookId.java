package com.example.demo.model;

import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

public class AuthorBookId implements Serializable {
    private Author author;
    private Book book;

    public AuthorBookId(Author author, Book book) {
        this.author = author;
        this.book = book;
    }

    public AuthorBookId() {
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthorBookId that = (AuthorBookId) o;
        return Objects.equals(author, that.author) && Objects.equals(book, that.book);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, book);
    }
}
