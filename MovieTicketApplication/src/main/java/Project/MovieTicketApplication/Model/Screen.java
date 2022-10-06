package Project.MovieTicketApplication.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Screen {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long screenId;
	private String name;
	private int goldSeat;
	private int platinumSeats;
	private int silverSeats;
	private String type;
	@JsonManagedReference
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "screen")
	private Movie  movie;
//	@ManyToOne
//	private CinemaIF cinemaIf;
	
	public Screen() {}
	
	public Screen(String name,int silverSeats, int goldSeat, int platinumSeats,  String type) {
	super();
	this.name = name;
	this.goldSeat = goldSeat;
	this.platinumSeats = platinumSeats;
	this.silverSeats = silverSeats;
	this.type = type;
//	this.movie = movie;
}

	public Long getScreenId() {
		return screenId;
	}
	public void setScreenId(Long screenId) {
		this.screenId = screenId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGoldSeat() {
		return goldSeat;
	}

	public void setGoldSeat(int goldSeat) {
		this.goldSeat = goldSeat;
	}

	public int getPlatinumSeats() {
		return platinumSeats;
	}

	public void setPlatinumSeats(int platinumSeats) {
		this.platinumSeats = platinumSeats;
	}

	public int getSilverSeats() {
		return silverSeats;
	}

	public void setSilverSeats(int silverSeats) {
		this.silverSeats = silverSeats;
	}

	@Override
	public String toString() {
		return "Screen [screenId=" + screenId + ", name=" + name + ", goldSeat=" + goldSeat + ", platinumSeats="
				+ platinumSeats + ", silverSeats=" + silverSeats + ", type=" + type + "]";
	}

	
	
}
