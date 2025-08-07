package in.cfn.main.services;

import java.util.List;
import java.util.Optional;

import in.cfn.main.entities.User;

public interface UserService {
	
	public User createUser(User user);
	public List<User> getAllUsers();
	public Optional<User> getUserDetailsById(int id);
	public User updateUserDetails(int id, User user);
	public void userDelete(int id);
	
	
}
