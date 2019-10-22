package com.shopshopista.humanss.controller.v1.persona;

import java.util.List;

import org.hibernate.Filter;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.shopshopista.humanss.model.cliente.Cliente;
import com.shopshopista.humanss.model.cliente.Preferencias;
import com.shopshopista.humanss.model.persona.Usuario;
import com.shopshopista.humanss.repository.persona.IUsuarioRepository;
import com.shopshopista.humanss.services.persona.PersonaService;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("api/v1/usuario")

@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
public class UsuarioController {

	@PersistenceContext 
    private EntityManager entityManager;
	
    @Autowired
    private IUsuarioRepository usuarioRepositorio;

    @Autowired
    private PersonaService PS;

    @GetMapping("/usuario")
    public List<Usuario> seleccionar() {
        return this.usuarioRepositorio.findAll();
    }

    @PostMapping("/editar")
    public Usuario editar(@RequestBody @Valid Usuario u) {
        return PS.guardarUsuario(u);
    }
    
    @PutMapping(path = {"/actualizar/{id}"})
    public Usuario actualizar(@RequestBody Usuario u, @PathVariable("id") Long id) {
        return PS.guardarUsuario(u);
    }
    
    @GetMapping(path = {"/{id}"})
    public Usuario seleccionarId(@PathVariable("id") Long id) {
        return this.usuarioRepositorio.getOne(id);
    }
    
    @GetMapping("/buscar/{nick}")
    @CrossOrigin
    public List<Usuario> buscarPorNick(@PathVariable("nick") String nick) {
        Filter filter = (Filter)entityManager.unwrap(Session.class).enableFilter("buscarPorNick");
        filter.setParameter("nick", nick);
        List<Usuario> usuarios = usuarioRepositorio.findAll();
        entityManager.unwrap(Session.class).disableFilter("buscarPorNick");
        return usuarios;
    }

}
