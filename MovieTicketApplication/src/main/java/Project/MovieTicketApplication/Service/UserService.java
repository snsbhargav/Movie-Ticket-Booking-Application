package Project.MovieTicketApplication.Service;


import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;

import Project.MovieTicketApplication.Model.UserEntity;

public interface UserService {
	public UserEntity saveUser(UserEntity user);
	
	public UserEntity getUserById(Long id);
}
