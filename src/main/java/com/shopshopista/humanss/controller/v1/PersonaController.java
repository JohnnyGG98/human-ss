package com.shopshopista.humanss.controller.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopshopista.humanss.model.Persona;
import com.shopshopista.humanss.repository.IPersonaRepository;

@RestController
public class PersonaController {

	@Autowired
	private IPersonaRepository personaRepositorio;
	
	@PostMapping("/")
    @ResponseBody
    public Persona guardar(@RequestBody Persona persona) {
        return this.personaRepositorio.save(persona);
    }
		
}
