package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Service //registra a classe como componente (Component, mas usamos Service pois especifica componente de serviço) do Spring permitindo fazer com ela injeçao de dependencia com @Autowired
public class UserService {
	
	@Autowired // injeção de dependencia feita pela STS de forma invisivel ao programador
	private UserRepository repository; //criando uma dependencia de UserRepository
	
	public List<User> findAll(){ // metodo para trazer todos os usuarios
		
		return repository.findAll();
		
	}
	
	public User findById(Long id) {
		
		Optional <User> obj = repository.findById(id);
		
		return obj.get(); //o get do Optional retorna o User que estiver dentro do obj
	}
	
	
	
	
	
	
	

}
