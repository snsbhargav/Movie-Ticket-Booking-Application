package Project.MovieTicketApplication.Service;

import java.util.List;

import Project.MovieTicketApplication.Model.Screen;

public interface ScreenService {
	public Screen saveScreen(Screen screen);
	
	public List<Screen> fetchAllScreens();
	
	public Screen fetchScreenById(Long id);
	
	public List<Screen> fetchScreensOfInox();

	public List<Screen> fetchScreensOfPvr();

}
