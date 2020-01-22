package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.repositories.OrderRepository;

@Service //registra a classe como componente (Component, mas usamos Service pois especifica componente de serviço) do Spring permitindo fazer com ela injeçao de dependencia com @Autowired
public class OrderService {
	
	@Autowired // injeção de dependencia feita pela STS de forma invisivel ao programador
	private OrderRepository repository; //criando uma dependencia de OrderRepository
	
	public List<Order> findAll(){ // metodo para trazer todos os usuarios
		
		return repository.findAll();
		
	}
	
	public Order findById(Long id) {
		
		Optional <Order> obj = repository.findById(id);
		
		return obj.get(); //o get do Optional retorna o Order que estiver dentro do obj
	}
	
	
	
	
	
	
	

}
