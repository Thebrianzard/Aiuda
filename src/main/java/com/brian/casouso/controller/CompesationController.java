package com.brian.casouso.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.brian.casouso.repository.CompesationRepository;

public class CompesationController {
	
	CompesationRepository compesationrepository;
	
	
	@GetMapping("/compesationFind")
	public String getcompesationFind(Model model) {
		
		//este es para ingresar los typos de compesationes
		model.addAttribute("compesation", compesationrepository.findAll());
		
		return "compesation-find";
	}
}
