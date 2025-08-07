package in.cfn.main.services;

import org.springframework.beans.factory.annotation.Autowired;

import in.cfn.main.entities.User;
import in.cfn.main.repositories.UserRepository;

public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User createUser(User user) {
		
		return userRepository.save(user);
		
	}

}
