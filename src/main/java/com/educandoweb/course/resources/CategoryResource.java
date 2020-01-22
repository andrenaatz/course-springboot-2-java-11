package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryService service; //dependencia para CategoryService
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		// usando pra incluir usuario manualmente em exercicio anterior: Category u = new Category(1L, "Maria", "maria@gmail.com", "999999", "1234");
		
		List<Category> list = service.findAll();
		
		return ResponseEntity.ok().body(list);//retorna ok na minha resposta com o conteudo de minha variavel no caso list
	}
	
	@GetMapping(value = "/{id}") //permite passar parametros na url
	public ResponseEntity<Category> findById(@PathVariable Long id){ //anotação @ para o Spring aceitar o parametro pela url
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		
		
	}
	

}
