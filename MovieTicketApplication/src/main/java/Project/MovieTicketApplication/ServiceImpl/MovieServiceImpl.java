package Project.MovieTicketApplication.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Project.MovieTicketApplication.Exception.MOVIE_NOT_FOUND;
import Project.MovieTicketApplication.Model.Movie;
import Project.MovieTicketApplication.Model.Screen;
import Project.MovieTicketApplication.Repository.MovieRepository;
import Project.MovieTicketApplication.Service.MovieService;

@Service
@Transactional
public class MovieServiceImpl implements MovieService {
	@Autowired
	private MovieRepository movieRepository;
	@Override
	public Movie saveMovie(Movie movie) {
		return movieRepository.save(movie);
	}
	@Override
	public List<Movie> fetchAllMovies() {
		return movieRepository.findAll();
	}
	@Override
	public Movie fetchMovieById(Long id) {
		Movie m =  movieRepository.findById(id).orElseThrow(()->new MOVIE_NOT_FOUND());
		System.out.println(m);
		return m;
	}
	@Override
	public List<Movie> fetchMovieInInox() {
		return movieRepository.fetchByType("INOX");
	}
	@Override
	public List<Movie> fetchMovieInPvr() {
		return movieRepository.fetchByType("PVR");
	}
	
	@Override
	public Long getScreenId(Long id) {
		return movieRepository.getScreenId(id);
	}

}
