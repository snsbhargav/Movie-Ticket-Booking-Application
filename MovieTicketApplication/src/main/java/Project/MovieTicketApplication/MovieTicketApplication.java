package Project.MovieTicketApplication;



import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

import Project.MovieTicketApplication.Model.CinemaIF;
import Project.MovieTicketApplication.Model.Movie;
import Project.MovieTicketApplication.Model.Screen;
import Project.MovieTicketApplication.Model.UserEntity;
import Project.MovieTicketApplication.Repository.UserEntityRepository;
import Project.MovieTicketApplication.Service.CinemaIfService;
import Project.MovieTicketApplication.ServiceImpl.CinemaIfServiceImpl;
import Project.MovieTicketApplication.ServiceImpl.MovieServiceImpl;
import Project.MovieTicketApplication.ServiceImpl.ScreenServiceImpl;
import Project.MovieTicketApplication.ServiceImpl.UserEntityServiceImpl;



@SpringBootApplication
public class MovieTicketApplication implements CommandLineRunner{
	
	public static void main(String[] args) {
		SpringApplication.run(MovieTicketApplication.class, args);
	}
	
	
	@Autowired
	private MovieServiceImpl movieService;
	@Autowired
	private CinemaIfServiceImpl cinemaIfService;
	@Autowired
	private UserEntityServiceImpl userService;
	
	
	//Logging of exception information 
	
	@Bean
	public CommonsRequestLoggingFilter requestLoggingFilter() {
	    CommonsRequestLoggingFilter loggingFilter = new CommonsRequestLoggingFilter();
	    loggingFilter.setIncludeClientInfo(true);
	    loggingFilter.setIncludeQueryString(true);
	    loggingFilter.setIncludePayload(true);
	    loggingFilter.setMaxPayloadLength(64000);
	    return loggingFilter;
	}

	
	//Adding the Admin Data to Database
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		UserEntity user1 = new UserEntity("snsbhargav@gmail.com","Bhargav@2000","Bhargav","Siddineni",22);
		userService.saveUser(user1);
		Screen s1 = new Screen("Screen1",100,140,160,"3D");
		Screen s2 = new Screen("Screen2",145,160,225,"2D");
		Movie m1 = new Movie("Andarivadu",LocalDate.of(2016, 7, 21),4,4,"Telugu","U/A");
		m1.setScreen(s1);
		Movie m2 = new Movie("Baahubali",LocalDate.of(2020, 6, 16),4,4.5,"Hindi","U");
		m2.setScreen(s2);
		movieService.saveMovie(m1);
		movieService.saveMovie(m2);
		
		List<Screen> li = new ArrayList<>();
		li.add(s1);
		li.add(s2);

		CinemaIF c1 = new CinemaIF("Alankar","Addala bazar jpt","PVR");
		cinemaIfService.saveCinema(c1);
		c1.setScreens(li);
		cinemaIfService.saveCinema(c1);
		
		Screen s3 = new Screen("Screen_A",110,150,220,"3D");
		Screen s4 = new Screen("Screen_B",100,160,180,"2D");
		Screen s5 = new Screen("Screen_C",120,160,1950,"3D");
		Movie m3 = new Movie("KGF",LocalDate.of(2019, 9, 25),4,4.25,"Kannada","U/A");
		m3.setScreen(s3);
		Movie m4 = new Movie("RRR",LocalDate.of(2022, 2, 16),4,4.5,"Telugu","U");
		m4.setScreen(s4);
		Movie m5 = new Movie("Avatar 2",LocalDate.of(2022, 6, 15),4,4.7,"English","U");	
		m5.setScreen(s5);
		movieService.saveMovie(m3);
		movieService.saveMovie(m4);
		movieService.saveMovie(m5);
		
		List<Screen> li1 = new ArrayList<>();
		li1.add(s3);
		li1.add(s4);
		li1.add(s5);

		CinemaIF c2 = new CinemaIF("Kamala","SeetaramaPuram jpt","INOX");
		cinemaIfService.saveCinema(c2);
		c2.setScreens(li1);
		cinemaIfService.saveCinema(c2);
	}

}
