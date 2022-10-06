package Project.MovieTicketApplication.Model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class BookedSeats {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long BookingId;
	
	private Long movieId;
	private String movieName;
	private Long userId;
	private String screenName;
	private Long amount;
	private LocalDate date;
	private String time;
	private String seatType;
	private int noOfSeats;
	public BookedSeats() {}

	public BookedSeats(Long movieId, String movieName, Long userId, String screenName, Long amount, LocalDate date,
			String time, String seatType, int noOfSeats) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.userId = userId;
		this.screenName = screenName;
		this.amount = amount;
		this.date = date;
		this.time = time;
		this.seatType = seatType;
		this.noOfSeats = noOfSeats;
	}

	public String getMovieName() {
		return movieName;
	}


	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}


	public String getScreenName() {
		return screenName;
	}


	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}


	public String getSeatType() {
		return seatType;
	}


	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}


	public int getNoOfSeats() {
		return noOfSeats;
	}


	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public Long getBookingId() {
		return BookingId;
	}
	public void setBookingId(Long bookingId) {
		BookingId = bookingId;
	}
	public Long getMovieId() {
		return movieId;
	}
	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "BookedSeats [BookingId=" + BookingId + ", movieId=" + movieId + ", movieName=" + movieName + ", userId="
				+ userId + ", screenName=" + screenName + ", amount=" + amount + ", date=" + date + ", time=" + time
				+ ", seatType=" + seatType + ", noOfSeats=" + noOfSeats + "]";
	}
	
	
}
