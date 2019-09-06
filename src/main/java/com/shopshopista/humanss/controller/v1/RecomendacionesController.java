package com.shopshopista.humanss.controller.v1;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@PostMapping("/")
    @ResponseBody
    public Recomendaciones guardar(@RequestBody Recomendaciones recomendaciones) {
        return this.recomendacionesRepositorio.save(recomendaciones);
    }
}
