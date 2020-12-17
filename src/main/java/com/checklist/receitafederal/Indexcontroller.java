package com.checklist.receitafederal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Indexcontroller {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}

}
