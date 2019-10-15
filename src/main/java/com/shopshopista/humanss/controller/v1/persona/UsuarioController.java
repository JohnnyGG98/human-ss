package com.shopshopista.humanss.controller.v1.persona;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopshopista.humanss.model.persona.Usuario;
import com.shopshopista.humanss.repository.persona.IUsuarioRepository;
import com.shopshopista.humanss.services.persona.PersonaService;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("api/v1/usuario")
public class UsuarioController {

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

}
