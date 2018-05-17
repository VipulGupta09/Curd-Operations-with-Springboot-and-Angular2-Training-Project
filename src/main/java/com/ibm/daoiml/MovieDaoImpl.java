package com.ibm.daoiml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ibm.model.Movie;

@Repository
public class MovieDaoImpl {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Movie> fetchAllMovies(){
		String sql="select * from movie";
		return jdbcTemplate.query(sql,new BeanPropertyRowMapper<Movie>(Movie.class));
		
	}

}
