package com.example.demo.model;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AuthorBookTest {
    @Test
    public void testAuthorBookConstructorAndGetters() {
        Author author = new Author(1, "Author Name", OffsetDateTime.now(), OffsetDateTime.now());
        Book book = new Book(1, "Book Name", OffsetDateTime.now(), OffsetDateTime.now());
        OffsetDateTime createdAt = OffsetDateTime.now();
        OffsetDateTime updatedAt = OffsetDateTime.now();

        AuthorBook authorBook = new AuthorBook(author, book, createdAt, updatedAt);

        assertEquals(author, authorBook.getAuthor());
        assertEquals(book, authorBook.getBook());
        assertEquals(createdAt, authorBook.getCreatedAt());
        assertEquals(updatedAt, authorBook.getUpdatedAt());
    }

    @Test
    public void testAuthorBookSetters() {
        Author author = new Author(1, "Author Name", OffsetDateTime.now(), OffsetDateTime.now());
        Book book = new Book(1, "Book Name", OffsetDateTime.now(), OffsetDateTime.now());
        OffsetDateTime createdAt = OffsetDateTime.now();
        OffsetDateTime updatedAt = OffsetDateTime.now();

        AuthorBook authorBook = new AuthorBook();

        authorBook.setAuthor(author);
        authorBook.setBook(book);
        authorBook.setCreatedAt(createdAt);
        authorBook.setUpdatedAt(updatedAt);

        assertEquals(author, authorBook.getAuthor());
        assertEquals(book, authorBook.getBook());
        assertEquals(createdAt, authorBook.getCreatedAt());
        assertEquals(updatedAt, authorBook.getUpdatedAt());
    }

    @Test
    public void testAuthorBookToString() {
        Author author = new Author(1, "Author Name", OffsetDateTime.now(), OffsetDateTime.now());
        Book book = new Book(1, "Book Name", OffsetDateTime.now(), OffsetDateTime.now());
        OffsetDateTime createdAt = OffsetDateTime.now();
        OffsetDateTime updatedAt = OffsetDateTime.now();

        AuthorBook authorBook = new AuthorBook(author, book, createdAt, updatedAt);

        String expected = "AuthorBook{" +
                "author=" + author +
                ", book=" + book +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';

        assertNotNull(authorBook.toString());
        assertEquals(expected, authorBook.toString());
    }
}
