package Project.MovieTicketApplication.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Project.MovieTicketApplication.Model.CinemaIF;
import Project.MovieTicketApplication.Repository.CinemaIfRepository;
import Project.MovieTicketApplication.Service.CinemaIfService;

@Service
@Transactional
public class CinemaIfServiceImpl implements CinemaIfService{
	@Autowired
	private CinemaIfRepository cinemaIfRepository;
	@Override
	public CinemaIF saveCinema(CinemaIF cinema) {
		return cinemaIfRepository.save(cinema);
	}

}
