package in.cfn.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.cfn.main.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
}
