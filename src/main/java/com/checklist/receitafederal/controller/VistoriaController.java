package com.checklist.receitafederal.controller;

import org.springframework.beans.factory.annotation.Autowired;
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

	@GetMapping("/cadastrarVistoria")
	public String form() {
		return "vistoria/formVistoria";
	}


	@PostMapping("/cadastrarVistoria")
	public String form2(Vistoria vistoria) {
		repository.save(vistoria);
		return "redirect:/cadastrarVistoria";
		
	}


}
