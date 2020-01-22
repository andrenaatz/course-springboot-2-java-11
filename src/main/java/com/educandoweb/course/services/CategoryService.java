package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.repositories.CategoryRepository;

@Service //registra a classe como componente (Component, mas usamos Service pois especifica componente de serviço) do Spring permitindo fazer com ela injeçao de dependencia com @Autowired
public class CategoryService {
	
	@Autowired // injeção de dependencia feita pela STS de forma invisivel ao programador
	private CategoryRepository repository; //criando uma dependencia de CategoryRepository
	
	public List<Category> findAll(){ // metodo para trazer todos os usuarios
		
		return repository.findAll();
		
	}
	
	public Category findById(Long id) {
		
		Optional <Category> obj = repository.findById(id);
		
		return obj.get(); //o get do Optional retorna o Category que estiver dentro do obj
	}
	
	
	
	
	
	
	

}
