package com.example.demo.controller;

import com.example.demo.domain.Actor;
import com.example.demo.domain.Movie;
import com.example.demo.services.BaseService;
import com.example.demo.services.CustomerService;

import com.example.demo.transfer.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/actors")
public class ActorController extends AbstractController<Actor> {
    private final CustomerService customerService;

    @Override
    public BaseService<Actor, Long> getBaseService() {
        return customerService;
    }


    @RequestMapping("/actorbyName")
    @GetMapping(params = {"firstname"})
    public ResponseEntity<ApiResponse<Actor>> findMovieDetails(String firstname) {


        final Actor results = customerService.findByName(firstname);

        return ResponseEntity.ok(ApiResponse.<Actor>builder().data(results).build());
    }
}