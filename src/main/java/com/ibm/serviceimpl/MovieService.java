package com.ibm.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.daoiml.MovieDaoImpl;
import com.ibm.model.Movie;

@Service
public class MovieService {
	@Autowired
	MovieDaoImpl movieDaoImpl;
	public List<Movie> getAllMovies(){
		
		List<Movie> l=new ArrayList<>();
			l= movieDaoImpl.fetchAllMovies();
			if(l.isEmpty()) {
				return null;
			}
			return l;
		/*try {
			if()
		return movieDaoImpl.fetchAllMovies();
		}
		catch(Exception e) {
			return null;
		}*/
	}

}
