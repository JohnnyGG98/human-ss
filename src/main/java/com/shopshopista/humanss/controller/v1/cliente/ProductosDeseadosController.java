package com.shopshopista.humanss.controller.v1.cliente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopshopista.humanss.model.cliente.ProductosDeseados;
import com.shopshopista.humanss.repository.cliente.IProductosDeseadosRepository;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("api/v1/producto/deseados")
public class ProductosDeseadosController {

    @Autowired
    private IProductosDeseadosRepository productosDeseadosRepositorio;

    @PostMapping("/guardar")
    @ResponseBody
    public ProductosDeseados guardar(@Valid @RequestBody ProductosDeseados productosDeseados) {
        return this.productosDeseadosRepositorio.save(productosDeseados);
    }

    @GetMapping("/")
    public List<ProductosDeseados> seleccionar() {
        return this.productosDeseadosRepositorio.findAll();
    }
}
