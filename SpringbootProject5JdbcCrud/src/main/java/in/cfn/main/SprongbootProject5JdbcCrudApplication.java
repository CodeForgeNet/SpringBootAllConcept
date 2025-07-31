package in.cfn.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.cfn.main.dao.UserDao;
import in.cfn.main.entity.User;

@SpringBootApplication
public class SprongbootProject5JdbcCrudApplication implements CommandLineRunner {

	@Autowired
	private UserDao userDao;
	
	public static void main(String[] args) {
		SpringApplication.run(SprongbootProject5JdbcCrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//-----INSERTION--------
		
//		User user1 = new User("Radha","radha@gmail.com","Female","Delhi");
//		User user2 = new User("Krishna","krishna@gmail.com","Male","Noida");
//		User user3 = new User("Karan","karan@gmail.com","Male","Noida");
//		
//		boolean status = userDao.insertUser(user3);
//		
//		if(status) {
//			System.out.println("User inserted Successfully");
//		}else {
//			System.out.println("User not inserted due to some error");
//		}
		
		
		//------UPDATION 1-------
		
//		User user = new User("karan","karan@gmail.com","Male","Gurgaon");
//		boolean status = userDao.updateUser(user);
//		if(status) {
//			System.out.println("Updated successfully");
//		}else {
//			System.out.println("Updation Failed");
//		}
		
		//------UPDATION 2-(Prefer this way only)------
		
//		User user = userDao.getUserByEmail("krishna@gmail.com");
//		user.setCity("Mumbai");
//		
//		boolean status = userDao.updateUser(user);
//		if(status) {
//			System.out.println("Updated successfully");
//		}else {
//			System.out.println("Updation Failed");
//		}
		
		
		//-------DELETION--------
		
//		boolean status = userDao.deleteUserByEmail("karan@gmail.com");
//		if(status) {
//			System.out.println("Deleted successfully");
//		}else {
//			System.out.println("Deletion failed");
//		}
		
		
		//------SELECT ONE USER ---------
		
//		User user = userDao.getUserByEmail("radha@gmail.com");
//		System.out.println("Name : "+user.getName());
//		System.out.println("Email : "+user.getEmail());
//		System.out.println("Gender : "+user.getGender());
//		System.out.println("City : "+user.getCity());
		
		
		//------SELECT ALL USER ---------
		List<User> list = userDao.getAllUsers();
		for(User user:list) {
			System.out.println("=-=-=-=-=-=-=-=-=-");
			System.out.println("Name : "+user.getName());
			System.out.println("Email : "+user.getEmail());
			System.out.println("Gender : "+user.getGender());
			System.out.println("City : "+user.getCity());
			System.out.println();
		}
		
		
	}

}
