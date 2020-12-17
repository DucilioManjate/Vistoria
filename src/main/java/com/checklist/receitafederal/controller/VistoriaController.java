package com.checklist.receitafederal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.checklist.receitafederal.model.Vistoria;
import com.checklist.receitafederal.repository.VistoriaRepository;

@RestController
public class VistoriaController {

	//Usar injeção de dependencia (Autowired) em construtores, evite usar direto na declaração
	private final VistoriaRepository repository;

	@Autowired
	public VistoriaController(VistoriaRepository er) {
		this.repository = er;
	}

	@GetMapping("/vistoria")
	public ResponseEntity<Iterable<Vistoria>> form() {
		Iterable<Vistoria> vistorias = repository.findAll();
		return ResponseEntity.ok(vistorias);
	}

	//Usar PostMapping ao inves de RequestMapping para Requisições POST
	@PostMapping("/cadastrarVistoria")
	//Colocar RequestBody na frente da variavel que servirá para armazenar o body da requisição
	public ResponseEntity<Vistoria> form2(@RequestBody Vistoria vistoria) {
		System.out.println(vistoria.getData());
		repository.save(vistoria);
		return ResponseEntity.ok(vistoria);
		
	}


}
