package com.example.demo.model;

import java.io.Serializable;
import java.util.Objects;

public class BookRentId implements Serializable {
    private Long personId;
    private Long bookId;

    public BookRentId(Long personId, Long bookId) {
        this.personId = personId;
        this.bookId = bookId;
    }

    public BookRentId() {
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookRentId that = (BookRentId) o;
        return Objects.equals(personId, that.personId) &&
                Objects.equals(bookId, that.bookId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personId, bookId);
    }

    @Override
    public String toString() {
        return "BookRentId{" +
                "personId=" + personId +
                ", bookId=" + bookId +
                '}';
    }
}
