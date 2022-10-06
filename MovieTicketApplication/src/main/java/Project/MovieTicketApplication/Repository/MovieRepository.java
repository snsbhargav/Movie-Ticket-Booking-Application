package Project.MovieTicketApplication.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import Project.MovieTicketApplication.Model.Movie;
import Project.MovieTicketApplication.Model.Screen;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{

	@Query(value = "SELECT * FROM movie WHERE screen_fk IN ("
			+ "SELECT Screens_screen_id FROM cinemaif_screens where cinemaif_cinema_id in ("
			+ "SELECT cinema_id from cinemaif WHERE type_of_cinema_if=?1)"
			+ ")",nativeQuery = true)
	public List<Movie> fetchByType(String type);
	
	
	
	@Query(value = "SELECT screen_fk from movie WHERE id=?1",nativeQuery = true)
	public Long getScreenId(Long id);
}
