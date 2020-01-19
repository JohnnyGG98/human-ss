package com.shopshopista.humanss.controller.v1.persona;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Filter;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopshopista.humanss.model.persona.Persona;
import com.shopshopista.humanss.model.persona.Usuario;
import com.shopshopista.humanss.model.vendedor.Vendedor;
import com.shopshopista.humanss.repository.persona.IPersonaRepository;
import com.shopshopista.humanss.repository.vendedor.IVendedorRepository;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@RequestMapping("api/v1/persona")

@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
public class PersonaController {

	@PersistenceContext 
    private EntityManager entityManager;
	
	@Autowired
	private IPersonaRepository personaRepositorio;

	
	 @GetMapping("/")
	 public List<Persona> seleccionar() {
	    return this.personaRepositorio.findAll();
	 }
	 
	 @GetMapping("/buscar/{id}")
	    public List<Persona> buscarPorUsuario(@PathVariable("id") Long id) {
	        Filter filter = (Filter)entityManager.unwrap(Session.class).enableFilter("buscarPorUsuario");
	        filter.setParameter("id", id);
	        List<Persona> personas = personaRepositorio.findAll();
	        entityManager.unwrap(Session.class).disableFilter("buscarPorUsuario");
	        return personas;
	    }
	 
	 
	 
	 

}
