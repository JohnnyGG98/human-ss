package com.shopshopista.humanss.controller.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopshopista.humanss.model.Calificaciones;
import com.shopshopista.humanss.repository.ICalificacionesRepository;

@RestController
public class CalificacionesController {

	@Autowired
	private ICalificacionesRepository calificacionesRepositorio;
	
	@PostMapping("/")
    @ResponseBody
    public Calificaciones guardar(@RequestBody Calificaciones calificaciones) {
        return this.calificacionesRepositorio.save(calificaciones);
    }
}
