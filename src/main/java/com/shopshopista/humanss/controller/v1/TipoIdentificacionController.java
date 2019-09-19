package com.shopshopista.humanss.controller.v1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopshopista.humanss.model.TipoIdentificacion;
import com.shopshopista.humanss.model.Vendedor;
import com.shopshopista.humanss.repository.ITipoIdentificacionRepository;



@RestController

public class TipoIdentificacionController {

	@Autowired
	private  ITipoIdentificacionRepository tipoIdentifiacionRepositorio;
	
	 @GetMapping("/tiposIdentificacion")
	 public List<TipoIdentificacion> seleccionar() {
	    return this.tipoIdentifiacionRepositorio.findAll();
	 }
	 
	 @PostMapping("/tipos-identificacion/insertar")
	    public TipoIdentificacion insertar(@RequestBody TipoIdentificacion tipoIdentificacion) {
	        return this.tipoIdentifiacionRepositorio.save(tipoIdentificacion);
	    }
}
