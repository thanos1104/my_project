package com.example.demo.repository;


import com.example.demo.domain.Actor;
import com.example.demo.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {


    @Query(value = "SELECT * FROM MOVIES M WHERE M.TITLE LIKE %:title% "
            ,nativeQuery = true)
    Movie findByTitle(String title);
}
