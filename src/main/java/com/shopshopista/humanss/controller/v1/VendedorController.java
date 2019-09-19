package com.shopshopista.humanss.controller.v1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;


import com.shopshopista.humanss.model.Vendedor;
import com.shopshopista.humanss.repository.IVendedorRepository;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT})
public class VendedorController {

	@Autowired
	private IVendedorRepository vendedorRepositorio;
	

	@PostMapping("/vendedores/insertar")
    public Vendedor insertar(@RequestBody Vendedor vendedor) {
        return this.vendedorRepositorio.save(vendedor);
    }
	
	 @GetMapping("/vendedores")
	 public List<Vendedor> seleccionar() {
	    return this.vendedorRepositorio.findAll();
	 }
	 
	 
	 @GetMapping(path= {"/vendedores/{id}"})
	 public Vendedor seleccionarId(@PathVariable("id") Long id) {
		 
		 return this.vendedorRepositorio.getOne(id);
		 
	 }
	 
	 
	 @PutMapping(path= {"/vendedores/actualizar/{id}"})
	 public Vendedor actualizar(@RequestBody Vendedor v, @PathVariable("id") Long id) {
		 return this.vendedorRepositorio.save(v);
	 }
	 
}
