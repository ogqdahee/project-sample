package com.example.samplecore.gateway.jpa;

import com.example.samplecore.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PersonRepository extends JpaRepository<Person, Long> {

    @Query("SELECT se FROM Person as se WHERE se.name = ?1")
    Person findByName(String name);
}
