package com.example.demo.model;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BookRentTest {
    @Test
    public void testBookRentConstructorAndGetters() {
        Long personId = 1L;
        Long bookId = 2L;
        OffsetDateTime createdAt = OffsetDateTime.now();
        OffsetDateTime updatedAt = OffsetDateTime.now();

        BookRent bookRent = new BookRent(personId, bookId, createdAt, updatedAt);

        assertEquals(personId, bookRent.getPersonId());
        assertEquals(bookId, bookRent.getBookId());
        assertEquals(createdAt, bookRent.getCreatedAt());
        assertEquals(updatedAt, bookRent.getUpdatedAt());
    }

    @Test
    public void testBookRentSetters() {
        Long personId = 1L;
        Long bookId = 2L;
        OffsetDateTime createdAt = OffsetDateTime.now();
        OffsetDateTime updatedAt = OffsetDateTime.now();

        BookRent bookRent = new BookRent();

        bookRent.setPersonId(personId);
        bookRent.setBookId(bookId);
        bookRent.setCreatedAt(createdAt);
        bookRent.setUpdatedAt(updatedAt);

        assertEquals(personId, bookRent.getPersonId());
        assertEquals(bookId, bookRent.getBookId());
        assertEquals(createdAt, bookRent.getCreatedAt());
        assertEquals(updatedAt, bookRent.getUpdatedAt());
    }

    @Test
    public void testBookRentToString() {
        Long personId = 1L;
        Long bookId = 2L;
        OffsetDateTime createdAt = OffsetDateTime.now();
        OffsetDateTime updatedAt = OffsetDateTime.now();

        BookRent bookRent = new BookRent(personId, bookId, createdAt, updatedAt);

        String expected = "BookRent{" +
                "personId=" + personId +
                ", bookId=" + bookId +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';

        assertNotNull(bookRent.toString());
        assertEquals(expected, bookRent.toString());
    }
}
