package com.example.demo.model;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AuthorTest {
    @Test
    public void testAuthorConstructorAndGetters() {
        Integer id = 1;
        String name = "John Doe";
        OffsetDateTime createdAt = OffsetDateTime.now();
        OffsetDateTime updatedAt = OffsetDateTime.now();

        Author author = new Author(id, name, createdAt, updatedAt);

        assertEquals(id, author.getId());
        assertEquals(name, author.getName());
        assertEquals(createdAt, author.getCreatedAt());
        assertEquals(updatedAt, author.getUpdatedAt());
    }

    @Test
    public void testAuthorSetters() {
        Integer id = 1;
        String name = "John Doe";
        OffsetDateTime createdAt = OffsetDateTime.now();
        OffsetDateTime updatedAt = OffsetDateTime.now();

        Author author = new Author();

        author.setId(id);
        author.setName(name);
        author.setCreatedAt(createdAt);
        author.setUpdatedAt(updatedAt);

        assertEquals(id, author.getId());
        assertEquals(name, author.getName());
        assertEquals(createdAt, author.getCreatedAt());
        assertEquals(updatedAt, author.getUpdatedAt());
    }

    @Test
    public void testAuthorToString() {
        Integer id = 1;
        String name = "John Doe";
        OffsetDateTime createdAt = OffsetDateTime.now();
        OffsetDateTime updatedAt = OffsetDateTime.now();

        Author author = new Author(id, name, createdAt, updatedAt);

        String expected = "Author{id=" + id +
                ", name='" + name + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';

        assertNotNull(author.toString());
        assertEquals(expected, author.toString());
    }
}
