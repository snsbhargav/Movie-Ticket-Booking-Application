package Project.MovieTicketApplication.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Project.MovieTicketApplication.Model.BookedSeats;
import Project.MovieTicketApplication.ServiceImpl.BookedSeatsServiceImpl;

@RestController
@CrossOrigin(origins = "*")
public class BookingController {

	@Autowired
	BookedSeatsServiceImpl bookedSeatsServiceImpl;
	@PostMapping("booked")
	public BookedSeats saveBooking(@RequestBody BookedSeats booked) {
		return bookedSeatsServiceImpl.saveBookedSeats(booked);
	}
	
	@GetMapping("all-bookings/{id}")
	public List<BookedSeats> finaAllBookingsById(@PathVariable Long id){
		return bookedSeatsServiceImpl.findAllBookings(id);
	}
	
	@PutMapping("update-booking")
	public BookedSeats updateBookings(@RequestBody BookedSeats bookedSeats) {
		return bookedSeatsServiceImpl.updateBooking(bookedSeats);
	}
	
	@DeleteMapping("delete-booking/{id}")
	public boolean deleteBooking(@PathVariable Long id) {
		return bookedSeatsServiceImpl.deleteBooking(id);
	}
	
	@GetMapping("booking/{id}")
	public BookedSeats findById(@PathVariable Long id) {
		return bookedSeatsServiceImpl.getBookingById(id);
	}
}
