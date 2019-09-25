package com.shopshopista.humanss.controller.v1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shopshopista.humanss.model.persona.TipoIdentificacion;
import com.shopshopista.humanss.model.persona.Vendedor;
import com.shopshopista.humanss.repository.ITipoIdentificacionRepository;



@RestController
@RequestMapping("api/v1/tipo-identificacion")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
public class TipoIdentificacionController {

	@Autowired
	private  ITipoIdentificacionRepository tipoIdentifiacionRepositorio;
	
	 @GetMapping("/")
	 public List<TipoIdentificacion> seleccionar() {
	    return this.tipoIdentifiacionRepositorio.findAll();
	 }
	 
	 @PostMapping("/guardar")
	    public TipoIdentificacion insertar(@RequestBody TipoIdentificacion tipoIdentificacion) {
	        return this.tipoIdentifiacionRepositorio.save(tipoIdentificacion);
	    }
}
