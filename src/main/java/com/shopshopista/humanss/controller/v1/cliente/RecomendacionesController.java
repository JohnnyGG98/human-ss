package com.shopshopista.humanss.controller.v1.cliente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopshopista.humanss.model.cliente.Recomendaciones;
import com.shopshopista.humanss.repository.cliente.IRecomendacionesRepository;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("api/v1/recomendacion/")
public class RecomendacionesController {

    @Autowired
    private IRecomendacionesRepository recomendacionesRepositorio;

    @PostMapping("/guardar")
    @ResponseBody
    public Recomendaciones guardar(@RequestBody Recomendaciones recomendaciones) {
        return this.recomendacionesRepositorio.save(recomendaciones);
    }

    @GetMapping("/")
    public List<Recomendaciones> seleccionar() {
        return this.recomendacionesRepositorio.findAll();
    }
}
