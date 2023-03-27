package com.example.demo.repository;

import com.example.demo.model.AuthorBook;
import com.example.demo.model.AuthorBookId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorBookRepository extends JpaRepository <AuthorBook, AuthorBookId> {

}
