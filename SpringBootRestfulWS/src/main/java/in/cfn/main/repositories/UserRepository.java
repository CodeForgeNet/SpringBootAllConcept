package in.cfn.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.cfn.main.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
}
