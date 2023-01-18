package com.bolsadeideas.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bolsadeideas.springboot.di.app.repository.IService;



@Controller
public class IndexController {
	
	@Autowired
	private IService servicio;
	
	@GetMapping({"/","","/index"})
	public String index(Model model) {
		model.addAttribute("gonzalo", servicio.operacion());
		return "index";
	}
	
}
