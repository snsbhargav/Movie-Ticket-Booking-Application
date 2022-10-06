package Project.MovieTicketApplication.Service;


import java.util.List;

import Project.MovieTicketApplication.Model.Movie;
import Project.MovieTicketApplication.Model.Screen;

public interface MovieService {
	public Movie saveMovie(Movie movie);
	
	public List<Movie> fetchAllMovies();
	
	public Movie fetchMovieById(Long id);
	
	public List<Movie> fetchMovieInInox();
	
	public List<Movie> fetchMovieInPvr();
		
	public Long getScreenId(Long id);

}
