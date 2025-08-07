package in.cfn.main.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.cfn.main.entities.User;
import in.cfn.main.services.UserService;

@RestController
public class MyController {
	
	@Autowired
	private UserService userService;

	@PostMapping("/user")
	public User addUserDetails( @RequestBody User user ) {
		
		return userService.createUser(user);
		
	}
	
}
