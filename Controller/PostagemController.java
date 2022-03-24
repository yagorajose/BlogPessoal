package org.generation.blogpessoal.controller;

import java.util.List;

import org.generation.blogpessoal.model.Postagem;
import org.generation.blogpessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //informa ao spring que a classe é um controlador
@RequestMapping("/postagens") //para o postman/insomnia usar nas buscas
@CrossOrigin("*") //para que a API aceite solicitações de outras linguagens.
public class PostagemController {

	
	@Autowired
	private PostagemRepository repository; 
	
	@GetMapping
	public ResponseEntity<List<Postagem>> GetAll(){
		
		return ResponseEntity.ok(repository.findAll());
		
	}
	
	
	
	
}
