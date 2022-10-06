package Project.MovieTicketApplication.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApplicationExceptionsController {

	@ExceptionHandler(value = BOOKING_NOT_FOUND.class)
	public ResponseEntity<Object> bookingIdNotFound(BOOKING_NOT_FOUND exception){
		return new ResponseEntity<Object>("Booking Id you are looking is not found in the database.",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value = MOVIE_NOT_FOUND.class)
	public ResponseEntity<Object> movieIdNotFound(MOVIE_NOT_FOUND exception){
		return new ResponseEntity<Object>("Movie Id you are looking is not found in the database.",HttpStatus.NOT_FOUND);
	}
	
	
	@ExceptionHandler(value = SCREEN_NOT_FOUND.class)
	public ResponseEntity<Object> screenIdNotFound(SCREEN_NOT_FOUND exception){
		return new ResponseEntity<Object>("Screen Id you are looking is not found in the database.",HttpStatus.NOT_FOUND);
		
	}
	
	@ExceptionHandler(value = USER_NOT_FOUND.class)
	public ResponseEntity<Object> userIdNotFound(USER_NOT_FOUND exception){
		return new ResponseEntity<Object>("User Id you are looking is not found in the database.",HttpStatus.NOT_FOUND);
	}
}
