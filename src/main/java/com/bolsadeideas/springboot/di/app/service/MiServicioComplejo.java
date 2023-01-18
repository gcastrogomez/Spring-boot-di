package com.bolsadeideas.springboot.di.app.service;

import org.springframework.stereotype.Component;

import com.bolsadeideas.springboot.di.app.repository.IService;

@Component("servicioComplejo")
//@Service
//@Primary or @Qualifier
public class MiServicioComplejo implements IService {
	
	public String operacion() {
		return "Hola chaval! Este es el complejo...";
	}
	
}
