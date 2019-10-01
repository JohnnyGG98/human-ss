package com.shopshopista.humanss.controller.v1.cliente;

import org.hibernate.Filter;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopshopista.humanss.model.cliente.Preferencias;
import com.shopshopista.humanss.repository.cliente.IPreferenciasRepository;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("v1/api/preferencia")

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT})
public class PreferenciasController {

	@PersistenceContext 
    private EntityManager entityManager;
	
    @Autowired
    private IPreferenciasRepository preferenciaRepository;

    @PostMapping("/guardar")
    @ResponseBody
    public Preferencias guardar(@RequestBody Preferencias preferencias) {
        return this.preferenciaRepository.save(preferencias);
    }

    @GetMapping("/")
    public List<Preferencias> seleccionar() {
        return this.preferenciaRepository.findAll();
    }
    
    @GetMapping("/buscar/{id}")
    public List<Preferencias> buscarPorCliente(@PathVariable("id") Long id) {
        Filter filter = (Filter)entityManager.unwrap(Session.class).enableFilter("buscarPorCliente");
        filter.setParameter("id", id);
        List<Preferencias> lista = preferenciaRepository.findAll();
        entityManager.unwrap(Session.class).disableFilter("buscarPorCliente");
        return lista;
    }
    
    
}