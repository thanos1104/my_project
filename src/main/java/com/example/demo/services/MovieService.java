package com.example.demo.services;

import com.example.demo.domain.Movie;
import com.example.demo.transfer.KeyValue;


import java.math.BigDecimal;
import java.util.List;

public interface MovieService extends BaseService<Movie, Long> {
    Movie findByTitle(String title);




}