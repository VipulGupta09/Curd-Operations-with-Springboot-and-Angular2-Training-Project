package com.ibm.dcontroller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.model.Movie;
import com.ibm.serviceimpl.MovieService;

@RestController
@RequestMapping("movie")
public class MovieController {
	
	@Autowired
	MovieService movieService;
	
	@RequestMapping("all")
	public List<Movie> getAll(){
		return movieService.getAllMovies();
	}

}
