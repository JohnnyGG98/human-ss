package com.shopshopista.humanss.controller.v1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopshopista.humanss.model.Persona;
import com.shopshopista.humanss.repository.IPersonaRepository;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("api/v1/persona/")
public class PersonaController {

	@Autowired
	private IPersonaRepository personaRepositorio;
	
	 @GetMapping("/")
	 public List<Persona> seleccionar() {
	    return this.personaRepositorio.findAll();
	 }
	 

}
