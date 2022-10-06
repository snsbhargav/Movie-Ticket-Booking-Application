package Project.MovieTicketApplication.Model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;
	private LocalDate releaseDate;
	private int showCycle;
	private double rating;
	private String language;
	private String certificate;
	@JsonBackReference
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="screen_fk",nullable = false,unique = true)
	Screen screen;
	
	public Movie() {}
	

	public Movie(String title, LocalDate releaseDate, int showCycle, double rating, String language, String certificate) {
		super();
		this.title = title;
		this.releaseDate = releaseDate;
		this.showCycle = showCycle;
		this.rating = rating;
		this.language = language;
		this.certificate = certificate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public int getShowCycle() {
		return showCycle;
	}

	public void setShowCycle(int showCycle) {
		this.showCycle = showCycle;
	}

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}
	

	public double getRating() {
		return rating;
	}


	public void setRating(double rating) {
		this.rating = rating;
	}



	public String getLanguage() {
		return language;
	}


	public void setLanguage(String language) {
		this.language = language;
	}


	public String getCertificate() {
		return certificate;
	}


	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}


	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", releaseDate=" + releaseDate + ", showCycle=" + showCycle
				+ ", rating=" + rating + ", language=" + language + ", certificate=" + certificate + ", screen=" + screen + "]";
	}


	
	
	
}

