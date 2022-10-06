package Project.MovieTicketApplication.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import Project.MovieTicketApplication.Model.Screen;

@Repository
public interface ScreenRepository extends JpaRepository<Screen, Long>{

	@Query(value = "SELECT * FROM screen WHERE screen_id IN ("
			+ "SELECT Screens_screen_id FROM cinemaif_screens where cinemaif_cinema_id in ("
			+ "SELECT cinema_id from cinemaif WHERE type_of_cinema_if=?1)"
			+ ")",nativeQuery = true)
	public List<Screen> fetchByType(String type);
}
