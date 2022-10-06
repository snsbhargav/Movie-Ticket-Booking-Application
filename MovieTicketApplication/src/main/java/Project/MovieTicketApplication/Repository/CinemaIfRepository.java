package Project.MovieTicketApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Project.MovieTicketApplication.Model.CinemaIF;

@Repository
public interface CinemaIfRepository extends JpaRepository<CinemaIF,Long>{

}
