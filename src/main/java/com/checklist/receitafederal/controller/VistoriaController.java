package com.checklist.receitafederal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.checklist.receitafederal.model.Vistoria;
import com.checklist.receitafederal.repository.VistoriaRepository;

@Controller
public class VistoriaController {
	
	@Autowired
	private VistoriaRepository er;
	
	@RequestMapping(value="/cadastrarVistoria", method=RequestMethod.GET)
	public String form() {
		return "vistoria/formVistoria";
	}
	@RequestMapping(value="/cadastrarVistoria", method=RequestMethod.POST)
	public String form(Vistoria vistoria) {
		er.save(vistoria);
		
		return "redirect:/cadastrarVistoria";
		
	}


}
