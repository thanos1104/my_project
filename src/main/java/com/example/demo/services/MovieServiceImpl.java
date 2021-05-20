package com.example.demo.services;

import com.example.demo.domain.Actor;
import com.example.demo.domain.Movie;
import com.example.demo.transfer.KeyValue;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl extends AbstractServiceImpl<Movie> implements MovieService {
    private final com.example.demo.repository.MovieRepository MovieRepository;

    @Override
    public JpaRepository<Movie, Long> getRepository() {
        return MovieRepository;
    }

    @Override
    public Movie findByTitle(String title) {

        return MovieRepository.findByTitle(title);
    }


}