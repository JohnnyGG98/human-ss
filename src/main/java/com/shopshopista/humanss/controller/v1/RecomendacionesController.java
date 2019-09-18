package com.shopshopista.humanss.controller.v1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopshopista.humanss.model.Recomendaciones;
import com.shopshopista.humanss.repository.IRecomendacionesRepository;



@RestController
public class RecomendacionesController {

	@Autowired
	private IRecomendacionesRepository recomendacionesRepositorio;
	
	@PostMapping("/recomendaciones/insertar")
    @ResponseBody
    public Recomendaciones guardar(@RequestBody Recomendaciones recomendaciones) {
        return this.recomendacionesRepositorio.save(recomendaciones);
    }
	
	 @GetMapping("/recomendaciones")
	 public List<Recomendaciones> seleccionar() {
	    return this.recomendacionesRepositorio.findAll();
	 }
}
