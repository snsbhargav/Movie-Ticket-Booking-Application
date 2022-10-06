package Project.MovieTicketApplication.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Project.MovieTicketApplication.Model.Movie;
import Project.MovieTicketApplication.Model.Screen;
import Project.MovieTicketApplication.ServiceImpl.MovieServiceImpl;

@RestController
@CrossOrigin(origins = "*")
public class MovieController {
	@Autowired
	private MovieServiceImpl movieService;

	@PostMapping("movie")
	public Movie saveMovie(@RequestBody Movie movie) {
		return movieService.saveMovie(movie);
	}
	
	@GetMapping("allmovies")
	public List<Movie> fetchAllMovies(){
		return movieService.fetchAllMovies();
	}
	
	@GetMapping("movie/{id}")
	public Movie fetchById(@PathVariable Long id) {
		return movieService.fetchMovieById(id);
	}
	
	@GetMapping("movie/INOX")
	public List<Movie> fetchByInox(){
		return movieService.fetchMovieInInox();
	}
	@GetMapping("movie/PVR")
	public List<Movie> fetchByPvr(){
		return movieService.fetchMovieInPvr();
	}
	
	
	@GetMapping("movscr/{id}")
	public Long getScreenId(@PathVariable Long id) {
		return movieService.getScreenId(id);
	}
}
