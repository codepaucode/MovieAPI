package com.mynt.MovieProjectApiPauGonzales.Service;

import com.mynt.MovieProjectApiPauGonzales.Enum.Genre;
import com.mynt.MovieProjectApiPauGonzales.Model.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> getAllMovies();
    Movie saveMovie(Movie movie);
    List<Movie> getMoviesByYear(int yearReleased);
    List<Movie>  getAllMoviesOrderByYearReleased();
    List<Movie> getMoviesByGenreAndNotIsSequel(Genre genre, Boolean isSequel);
    String getSecurity();
}