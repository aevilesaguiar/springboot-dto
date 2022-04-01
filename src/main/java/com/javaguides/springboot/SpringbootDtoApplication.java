package com.javaguides.springboot;

import com.javaguides.springboot.model.Location;
import com.javaguides.springboot.model.User;
import com.javaguides.springboot.repository.LocationRepository;
import com.javaguides.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDtoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDtoApplication.class, args);
	}
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private LocationRepository locationRepository;
	@Override
	public void run(String... args) throws Exception {
	Location location = new Location();
	location.setPlace("São paulo");
	location.setDescription("Brazil is Beautiful");
	location.setLongitude(30.5);
	location.setLatitude(40.8);
	locationRepository.save(location);

	User user1 = new User();
	user1.setFirstName("Aeviles");
	user1.setLastName("Aguiar");
	user1.setEmail("aeviles@email.com.br");
	user1.setPassword("secret");
	userRepository.save(user1);

	User user2 = new User();
	user2.setFirstName("Corinthians");
	user2.setLastName("Brazil");
	user2.setEmail("corinthians@email.com.br");
	user2.setPassword("corinthians");
	userRepository.save(user2);

	}
}
