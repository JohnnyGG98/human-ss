package com.shopshopista.humanss.controller.v1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.shopshopista.humanss.model.Cliente;
import com.shopshopista.humanss.repository.IClienteRepository;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/cliente")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT})
public class ClienteController {

    @Autowired
    private IClienteRepository clienteRepositorio;

    @PostMapping("/guardar")
    public Cliente insertar(@Valid @RequestBody Cliente cliente) {
        return this.clienteRepositorio.save(cliente);
    }

    @GetMapping("/")
    public List<Cliente> seleccionar() {
        return this.clienteRepositorio.findAll();
    }
}
