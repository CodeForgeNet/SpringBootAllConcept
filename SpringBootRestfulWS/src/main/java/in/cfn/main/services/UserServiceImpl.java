package in.cfn.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.cfn.main.entities.User;
import in.cfn.main.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User createUser(User user) {
		
		return userRepository.save(user);
		
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll() ;
	}

	
	
	@Override
	public Optional<User> getUserDetailsById(int id) {
		
		return userRepository.findById(id) ;
		
	}

	
//	This method is not good
	@Override
	public User updateUserDetails(int id, User newUser) {
		
		User userData = userRepository.findById(id).orElse(null);
		if(userData != null) {
			return userRepository.save(newUser);
		}else {
			throw new RuntimeException("User not found with id "+id) ;			
		}
		
	}

	
	
	
	@Override
	public void userDelete(int id) {
	
		userRepository.deleteById(id);
		
	}
	
	

}
