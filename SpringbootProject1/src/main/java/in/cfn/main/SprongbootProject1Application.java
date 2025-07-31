package in.cfn.main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SprongbootProject1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SprongbootProject1Application.class, args);
		
//		System.out.p rintln("Spring Boot Application Started Successfully!");
	}

	@Override
	public void run(String... args) throws Exception {
		myClass().printMessage("Karan");
	}
	
	@Bean
	public MyClass myClass() {
		return new MyClass();
	}

}
