package Project.MovieTicketApplication.Model;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class CinemaIF {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cinemaId;
	private String name;
	private String address;
	private String typeOfCinemaIf; //INOX or PVR
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Screen> screens;
	
	public CinemaIF() {}
	

	public CinemaIF(String name, String address,String type) {
		super();
		this.name = name;
		this.address = address;
		typeOfCinemaIf = type;
//		this.screens = screens;
	}


	public Long getCinemaId() {
		return cinemaId;
	}

	public void setCinemaId(Long cinemaId) {
		this.cinemaId = cinemaId;
	}

	public List<Screen> getScreens() {
		return screens;
	}

	public void setScreens(List<Screen> screens) {
		this.screens = screens;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getTypeOfCinemaIf() {
		return typeOfCinemaIf;
	}


	public void setTypeOfCinemaIf(String typeOfCinemaIf) {
		this.typeOfCinemaIf = typeOfCinemaIf;
	}


	@Override
	public String toString() {
		return "CinemaIF [cinemaId=" + cinemaId + ", name=" + name + ", address=" + address + ", screens=" + screens
				+ "]";
	}


	
	
	
}
