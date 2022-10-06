package Project.MovieTicketApplication.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Project.MovieTicketApplication.Exception.USER_NOT_FOUND;
import Project.MovieTicketApplication.Model.UserEntity;
import Project.MovieTicketApplication.Repository.UserEntityRepository;
import Project.MovieTicketApplication.Service.UserService;

@Service
@Transactional
public class UserEntityServiceImpl implements UserService{

	@Autowired
	private UserEntityRepository repository;

	@Override
	public UserEntity saveUser(UserEntity user) {
		return repository.save(user);
	}


	@Override
	public UserEntity getUserById(Long id) {
		return repository.findById(id).orElseThrow(()-> new USER_NOT_FOUND());
	}
	

}
