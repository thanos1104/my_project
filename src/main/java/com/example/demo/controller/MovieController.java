package com.example.demo.controller;

import com.example.demo.domain.Actor;
import com.example.demo.domain.Movie;
import com.example.demo.services.BaseService;
import com.example.demo.services.MovieService;
import com.example.demo.transfer.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/movies")
public class MovieController extends AbstractController<Movie> {
    private final MovieService movieService;

    @Override
    public BaseService<Movie, Long> getBaseService() {
        return movieService;
    }



    @RequestMapping("/moviebyTitle")
    @GetMapping(params = {"title"})
    public ResponseEntity<ApiResponse<Movie>> findMovieDetails(String title) {


        final Movie results = movieService.findByTitle(title);

        return ResponseEntity.ok(ApiResponse.<Movie>builder().data(results).build());
    }

}