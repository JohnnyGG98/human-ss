package com.shopshopista.humanss.controller.v1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopshopista.humanss.model.Persona;
import com.shopshopista.humanss.repository.IPersonaRepository;


@RestController
public class PersonaController {

	@Autowired
	private IPersonaRepository personaRepositorio;
	
	 @GetMapping("/personas")
	 public List<Persona> seleccionar() {
	    return this.personaRepositorio.findAll();
	 }
	 

}
