package com.shopshopista.humanss.controller.v1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopshopista.humanss.model.Cliente;
import com.shopshopista.humanss.repository.IClienteRepository;

@RestController
public class ClienteController {

	@Autowired
	private IClienteRepository clienteRepositorio;
	
	@PostMapping("/clientes/insertar")
    public Cliente insertar(@RequestBody Cliente cliente) {
        return this.clienteRepositorio.save(cliente);
    }
	
	 @GetMapping("/clientes")
	 public List<Cliente> seleccionar() {
	    return this.clienteRepositorio.findAll();
	 }
}
