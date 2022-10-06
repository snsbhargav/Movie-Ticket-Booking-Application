package Project.MovieTicketApplication.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Project.MovieTicketApplication.Exception.SCREEN_NOT_FOUND;
import Project.MovieTicketApplication.Model.Screen;
import Project.MovieTicketApplication.Repository.ScreenRepository;
import Project.MovieTicketApplication.Service.ScreenService;

@Service
@Transactional
public class ScreenServiceImpl implements ScreenService {
	@Autowired
	private ScreenRepository screenRepository;
	@Override
	public Screen saveScreen(Screen screen) {
		return screenRepository.save(screen);
	}
	@Override
	public List<Screen> fetchAllScreens() {
		return screenRepository.findAll();
	}
	@Override
	public Screen fetchScreenById(Long id) {
		return screenRepository.findById(id).orElseThrow(()->new SCREEN_NOT_FOUND());
	}
	@Override
	public List<Screen> fetchScreensOfInox() {
		return screenRepository.fetchByType("INOX");
	}
	@Override
	public List<Screen> fetchScreensOfPvr() {
		return screenRepository.fetchByType("PVR");

	}
	


}
