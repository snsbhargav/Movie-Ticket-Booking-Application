package Project.MovieTicketApplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Project.MovieTicketApplication.Model.UserEntity;
import Project.MovieTicketApplication.ServiceImpl.UserEntityServiceImpl;

@RestController
@CrossOrigin(origins = "*")
public class UserController {
	@Autowired
	UserEntityServiceImpl userService;
	
	@PostMapping("/user")
	public UserEntity registerUser(@RequestBody UserEntity user) {
		return userService.saveUser(user);
		
	}
	
	@GetMapping("/user/{id}")
	public UserEntity getUser(@PathVariable Long id) {
		return userService.getUserById(id);
	}
	
//	@RequestMapping(value = "/login",method = RequestMethod.GET)
//	public String login() {
//		return "Login";
//	}
//	
//	@RequestMapping(value = "/login",method = RequestMethod.POST)
//	public String register(@RequestParam Long userId, @RequestParam String password,ModelMap model) {
//		
//		if(userService.getUserById(userId)!=null) {
//			if((userService.getUserById(userId).getPassword().equals(password))) {
//				return "welcome";
//			}
//		}
//		model.put("errorMsg", "Please enter valid credentials.");
//		return "Login";
//	}
//	
//	@RequestMapping(value="/register",method = RequestMethod.GET)
//	public String register() {
//		return "register";
//	}
//	@RequestMapping(value="/register",method = RequestMethod.POST)
//	public String saveRegister(@RequestParam String firstname,@RequestParam String lastname,
//			@RequestParam int age,@RequestParam String email,@RequestParam String password) {
//		UserEntity user = new UserEntity(email, password, firstname, lastname, age);
//		System.out.println(user);
//		userService.saveUser(user);
//		return "login";
//	}
	
	
	
	
	
}
