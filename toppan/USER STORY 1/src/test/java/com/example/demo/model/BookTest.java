package com.example.demo.model;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BookTest {

    @Test
    public void testBookConstructorAndGetters() {
        Integer id = 1;
        String name = "The Catcher in the Rye";
        OffsetDateTime createdAt = OffsetDateTime.now();
        OffsetDateTime updatedAt = OffsetDateTime.now();

        Book book = new Book(id, name, createdAt, updatedAt);

        assertEquals(id, book.getId());
        assertEquals(name, book.getName());
        assertEquals(createdAt, book.getCreatedAt());
        assertEquals(updatedAt, book.getUpdatedAt());
    }

    @Test
    public void testBookSetters() {
        Integer id = 1;
        String name = "The Catcher in the Rye";
        OffsetDateTime createdAt = OffsetDateTime.now();
        OffsetDateTime updatedAt = OffsetDateTime.now();

        Book book = new Book();

        book.setId(id);
        book.setName(name);
        book.setCreatedAt(createdAt);
        book.setUpdatedAt(updatedAt);

        assertEquals(id, book.getId());
        assertEquals(name, book.getName());
        assertEquals(createdAt, book.getCreatedAt());
        assertEquals(updatedAt, book.getUpdatedAt());
    }

    @Test
    public void testBookToString() {
        Integer id = 1;
        String name = "The Catcher in the Rye";
        OffsetDateTime createdAt = OffsetDateTime.now();
        OffsetDateTime updatedAt = OffsetDateTime.now();

        Book book = new Book(id, name, createdAt, updatedAt);

        String expected = "Book{id=" + id +
                ", name='" + name + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';

        assertNotNull(book.toString());
        assertEquals(expected, book.toString());
    }
}
