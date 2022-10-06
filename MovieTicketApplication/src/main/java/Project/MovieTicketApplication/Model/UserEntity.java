package Project.MovieTicketApplication.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String mail;
	private String password;
	private String firstName;
	private String lastName;
	private int age;
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<CinemaIF> cinemaIf;
	
	public UserEntity() {}

	public UserEntity(String mail, String password, String firstName, String lastName, int age) {
		super();
		this.mail = mail;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<CinemaIF> getCinemaIf() {
		return cinemaIf;
	}

	public void setCinemaIf(List<CinemaIF> cinemaIf) {
		this.cinemaIf = cinemaIf;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", mail=" + mail + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", age=" + age + ", cinemaIf=" + cinemaIf + "]";
	}
	
	
	
}
