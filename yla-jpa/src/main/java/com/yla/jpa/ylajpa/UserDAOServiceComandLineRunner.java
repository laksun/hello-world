package com.yla.jpa.ylajpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.yla.jpa.ylajpa.entity.User;
import com.yla.jpa.ylajpa.repository.UserRepository;
import com.yla.jpa.ylajpa.service.UserDAOService;

@Component
public class UserDAOServiceComandLineRunner implements CommandLineRunner {
	
	private static final Logger log = LoggerFactory.getLogger(UserDAOServiceComandLineRunner.class);
	
	@Autowired
	UserDAOService userDAOservice;
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User("Yusuf", "Admin");
		long insert = userDAOservice.insert(user);
		log.info("new user is created" + insert);
		
		
		User user2 = new User("Ahmet", "Admin");
		userRepository.save(user2);
	}

}
