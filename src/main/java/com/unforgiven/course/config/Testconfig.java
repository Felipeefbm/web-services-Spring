package com.unforgiven.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.unforgiven.course.entityes.User;
import com.unforgiven.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class Testconfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		User u3 = new User(null, "CACIO CHUPA PICA", "SAFADO@gmail.com", "977777777", "24242424"); 
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3));
	}
	
	
	
}

