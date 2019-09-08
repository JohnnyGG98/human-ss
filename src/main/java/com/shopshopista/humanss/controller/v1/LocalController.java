package com.shopshopista.humanss.controller.v1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopshopista.humanss.model.Local;
import com.shopshopista.humanss.repository.ILocalRepository;

@RestController
public class LocalController  {

	@Autowired
	private ILocalRepository localRepositorio;
	
	@PostMapping("/locales/insertar")
    public Local insertar(@RequestBody Local local) {
        return this.localRepositorio.save(local);
    }
	
	 @GetMapping("/locales")
	 public List<Local> seleccionar() {
	    return this.localRepositorio.findAll();
	 }
}
