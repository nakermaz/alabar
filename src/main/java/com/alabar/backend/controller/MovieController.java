package com.alabar.backend.controller;

import com.alabar.backend.dto.movieDTO.ListMainPageDTO;
import com.alabar.backend.serivce.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/movie/")
public class MovieController {
    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/mainPage")
    public ListMainPageDTO getMainPage(){
        return movieService.getMainPage();
    }
}
