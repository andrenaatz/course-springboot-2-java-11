package com.educandoweb.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Configuration
@Profile("test")//este nome deve ser o mesmo especificado no application.properties.. profile... o STS vai saber que esta configuração será usada somente quando vc estiver no perfil de test
public class TestConfig implements CommandLineRunner {

	@Autowired // o STS identifica uma dependencia com este @... e associa uma instancia neste caso de User na classe TestConfig
	private UserRepository userRepository; // dependencia

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");	
		
		//salvar os dois usuarios acima no DB
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
	
	
	

}
