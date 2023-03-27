package com.example.demo.model;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PersonTest {
    @Test
    public void testPersonConstructorAndGetters() {
        Integer id = 1;
        String name = "John Doe";
        OffsetDateTime createdAt = OffsetDateTime.now();
        OffsetDateTime updatedAt = OffsetDateTime.now();
        Long countryId = 100L;

        Person person = new Person(id, name, createdAt, updatedAt, countryId);

        assertEquals(id, person.getId());
        assertEquals(name, person.getName());
        assertEquals(createdAt, person.getCreatedAt());
        assertEquals(updatedAt, person.getUpdatedAt());
        assertEquals(countryId, person.getCountryId());
    }

    @Test
    public void testPersonSetters() {
        Integer id = 1;
        String name = "John Doe";
        OffsetDateTime createdAt = OffsetDateTime.now();
        OffsetDateTime updatedAt = OffsetDateTime.now();
        Long countryId = 100L;

        Person person = new Person();

        person.setId(id);
        person.setName(name);
        person.setCreatedAt(createdAt);
        person.setUpdatedAt(updatedAt);
        person.setCountryId(countryId);

        assertEquals(id, person.getId());
        assertEquals(name, person.getName());
        assertEquals(createdAt, person.getCreatedAt());
        assertEquals(updatedAt, person.getUpdatedAt());
        assertEquals(countryId, person.getCountryId());
    }

    @Test
    public void testPersonToString() {
        Integer id = 1;
        String name = "John Doe";
        OffsetDateTime createdAt = OffsetDateTime.now();
        OffsetDateTime updatedAt = OffsetDateTime.now();
        Long countryId = 100L;

        Person person = new Person(id, name, createdAt, updatedAt, countryId);

        String expected = "Person{id=" + id +
                ", name='" + name + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", countryId=" + countryId +
                '}';

        assertNotNull(person.toString());
        assertEquals(expected, person.toString());
    }
}
