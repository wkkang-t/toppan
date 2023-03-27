package com.example.demo.repository;

import com.example.demo.model.BookRent;
import com.example.demo.model.BookRentId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface BookRentRepository extends JpaRepository<BookRent, BookRentId> {

    @Query(nativeQuery = true, value = "SELECT b.name" +
            " FROM books b" +
            " JOIN book_rents br ON b.id = br.book_id" +
            " GROUP BY b.id, b.name" +
            " ORDER BY COUNT(br.book_id) DESC" +
            " LIMIT 3;")
    List<String> getTopBooks(String name);

    @Query(nativeQuery = true, value = "WITH global_top_books AS (" +
            "    SELECT b.id, b.name, COUNT(br.book_id) as rented_count" +
            "    FROM books b" +
            "    JOIN book_rents br ON b.id = br.book_id" +
            "    GROUP BY b.id, b.name" +
            "    ORDER BY rented_count DESC" +
            "    LIMIT 3" +
            ")," +
            "book_rent_counts AS (" +
            "    SELECT p.id AS person_id, p.name AS person_name, br.book_id, COUNT(br.book_id) AS rent_count" +
            "    FROM people p" +
            "    JOIN book_rents br ON p.id = br.person_id" +
            "    WHERE p.country_id = :country_id" +
            "    GROUP BY p.id, p.name, br.book_id" +
            ")," +
            "ranked_book_rents AS (" +
            "    SELECT book_id, person_id, person_name, rent_count," +
            "        RANK() OVER (PARTITION BY book_id ORDER BY rent_count DESC) as rent_rank" +
            "    FROM book_rent_counts" +
            ")" +
            "SELECT g.name AS book_name, r.person_name" +
            "FROM global_top_books g" +
            "JOIN ranked_book_rents r ON g.id = r.book_id" +
            "WHERE r.rent_rank <= 3" +
            "ORDER BY g.name, r.rent_rank")
    List<String> findTopRentersByCountry(@Param("country_id") Long countryId);
}
