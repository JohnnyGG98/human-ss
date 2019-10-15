package com.shopshopista.humanss.controller.v1.vendedor;

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

import com.shopshopista.humanss.model.persona.Persona;
import com.shopshopista.humanss.model.vendedor.Vendedor;
import com.shopshopista.humanss.repository.vendedor.IVendedorRepository;
import com.shopshopista.humanss.services.persona.PersonaService;

@RestController

@RequestMapping("api/v1/vendedor")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
public class VendedorController {

    @Autowired
    private IVendedorRepository vendedorRepositorio;

    @Autowired
    private PersonaService PS;

    @PostMapping("/guardar")
    public Vendedor insertar(@RequestBody Vendedor vendedor) {
        return PS.guardarVendedor(vendedor);
    }

    @GetMapping("/")
    public List<Vendedor> seleccionar() {
        return this.vendedorRepositorio.findAll();
    }

    @GetMapping(path = {"/{id}"})
    public Vendedor seleccionarId(@PathVariable("id") Long id) {
        return this.vendedorRepositorio.getOne(id);
    }

    @PutMapping(path = {"/editar/{id}"})
    public Vendedor actualizar(@RequestBody Vendedor v, @PathVariable("id") Long id) {
        return PS.guardarVendedor(v);
    }

    @PutMapping(path = {"/eliminar/{id}"})
    public Persona eliminar(@RequestBody Vendedor p, @PathVariable("id") Long id) {
        return this.vendedorRepositorio.save(p);
    }

}
