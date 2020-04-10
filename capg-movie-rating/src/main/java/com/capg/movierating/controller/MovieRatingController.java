package com.capg.movierating.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capg.movierating.model.MovieRating;
import com.capg.movierating.service.MovieRatingService;

@RestController
@RequestMapping("/rating")
public class MovieRatingController {
	
	@Autowired
	MovieRatingService service;
	
	@GetMapping("/id/{id}")
	public MovieRating getMovieRatingUsingId(long id) {
		return service.getMovieRating(id);
	}

	@PostMapping("/add")
	public MovieRating addMovieRating(@RequestBody MovieRating movie) {
		return service.addMovieRating(movie);
	}
}
