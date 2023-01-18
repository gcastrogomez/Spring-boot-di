package com.bolsadeideas.springboot.di.app.service;

import org.springframework.stereotype.Component;

import com.bolsadeideas.springboot.di.app.repository.IService;

@Component("servicioSimple")
//@Service
//@Primary or @Qualifier
public class MiServicio implements IService {
	
	public String operacion() {
		return "Hola chaval! Este es el simple...";
	}
	
}
