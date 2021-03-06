package com.example.demo.repository;

import com.example.demo.domain.Actor;
import com.example.demo.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Long> {

    @Query(value = "SELECT * FROM ACTORS A WHERE A.FIRSTNAME LIKE %:firstname% "
            ,nativeQuery = true)
    Actor findByName(String firstname);
}