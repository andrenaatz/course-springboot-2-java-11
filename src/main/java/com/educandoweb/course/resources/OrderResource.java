package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	
	@Autowired
	private OrderService service; //dependencia para OrderService
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		// usando pra incluir usuario manualmente em exercicio anterior: Order u = new Order(1L, "Maria", "maria@gmail.com", "999999", "1234");
		
		List<Order> list = service.findAll();
		
		return ResponseEntity.ok().body(list);//retorna ok na minha resposta com o conteudo de minha variavel no caso list
	}
	
	@GetMapping(value = "/{id}") //permite passar parametros na url
	public ResponseEntity<Order> findById(@PathVariable Long id){ //anotação @ para o Spring aceitar o parametro pela url
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		
		
	}
	

}
