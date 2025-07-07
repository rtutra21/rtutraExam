package edu.javaDigitalCaf.rtutra;



import edu.javaDigitalCaf.rtutra.model.Country;
import edu.javaDigitalCaf.rtutra.model.User;
import edu.javaDigitalCaf.rtutra.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class RtutraApplication {

	public static void main(String[] args) {
		SpringApplication.run(RtutraApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(UserRepository userRepository) {
		return args -> {
			userRepository.save(new User(null, "John", 25, Country.USA));
			userRepository.save(new User(null, "Максим", 30, Country.RUSSIA));
			userRepository.save(new User(null, "Diego", 20, Country.MEXICO));
			userRepository.save(new User(null, "Jannik", 18, Country.GERMANY));
			userRepository.save(new User(null, "傅浩宇", 35, Country.CHINA));
		};
	}

}
