package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService service; //dependencia para UserService
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		// usando pra incluir usuario manualmente em exercicio anterior: User u = new User(1L, "Maria", "maria@gmail.com", "999999", "1234");
		
		List<User> list = service.findAll();
		
		return ResponseEntity.ok().body(list);//retorna ok na minha resposta com o conteudo de minha variavel no caso list
	}
	
	@GetMapping(value = "/{id}") //permite passar parametros na url
	public ResponseEntity<User> findById(@PathVariable Long id){ //anotação @ para o Spring aceitar o parametro pela url
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		
		
	}
	

}
