package com.shopshopista.humanss.controller.v1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopshopista.humanss.model.Usuario;
import com.shopshopista.humanss.repository.IUsuarioRepository;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("api/v1/usuario")
public class UsuarioController {

    @Autowired
    private IUsuarioRepository usuarioRepositorio;

    @GetMapping("/usuario")
    public List<Usuario> seleccionar() {
        return this.usuarioRepositorio.findAll();
    }

}
