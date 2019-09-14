package com.shopshopista.humanss.controller.v1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopshopista.humanss.model.ProductosDeseados;
import com.shopshopista.humanss.repository.IProductosDeseadosRepository;



@RestController
public class ProductosDeseadosController {

	@Autowired
	private IProductosDeseadosRepository productosDeseadosRepositorio;
	
	@PostMapping("/productosDeseados")
    @ResponseBody
    public ProductosDeseados guardar(@RequestBody ProductosDeseados productosDeseados) {
        return this.productosDeseadosRepositorio.save(productosDeseados);
    }
	
	@GetMapping("/productosDeseados")
	 public List<ProductosDeseados> seleccionar() {
	    return this.productosDeseadosRepositorio.findAll();
	 }
}
