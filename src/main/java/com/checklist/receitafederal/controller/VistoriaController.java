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


	@PostMapping("/cadastrarVistoria")
	public ResponseEntity<Vistoria> form2(Vistoria vistoria) {
		System.out.println(vistoria.getData());
		repository.save(vistoria);
		return ResponseEntity.ok(vistoria);
		
	}


}
