package com.example.demo.model;

import jakarta.persistence.*;

import java.time.OffsetDateTime;

@Entity
@IdClass(AuthorBookId.class)
@Table(name = "author_books")
public class AuthorBook {
    @Id
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    @Id
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @Column(name = "createdAt", nullable = false)
    private OffsetDateTime createdAt;

    @Column(name = "updatedAt", nullable = false)
    private OffsetDateTime updatedAt;

    public AuthorBook(Author author, Book book, OffsetDateTime createdAt, OffsetDateTime updatedAt) {
        this.author = author;
        this.book = book;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public AuthorBook() {
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "AuthorBook{" +
                "author=" + author +
                ", book=" + book +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
