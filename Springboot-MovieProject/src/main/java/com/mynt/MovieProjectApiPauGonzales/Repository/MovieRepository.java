package com.mynt.MovieProjectApiPauGonzales.Repository;

import com.mynt.MovieProjectApiPauGonzales.Model.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Long>{
//    List<Movie> getMoviesByYear(int year);
//    Movie saveMovie(Movie movie);
//    List<Movie> getMoviesByYear(int yearReleased);
//    List<Movie>  getAllMoviesOrderByYearReleased();
//    List<Movie> getMoviesByGenreAndNotIsSequel();
}
