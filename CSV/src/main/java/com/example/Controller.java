package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.MovieService;

@RestController
public class Controller {

	@Autowired
	private MovieService ms;
	
	@RequestMapping(path="loadMovieData")
	public void setDatainDB() {
		ms.saveMovies(); 
	}
}
