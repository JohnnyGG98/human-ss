package com.shopshopista.humanss.controller.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopshopista.humanss.model.Calificaciones;
import com.shopshopista.humanss.repository.ICalificacionesRepository;
import java.util.List;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("api/vi/calificacion")
public class CalificacionesController {

    @Autowired
    private ICalificacionesRepository calificacionesRepositorio;

    @PostMapping("/guardar")
    @ResponseBody
    public Calificaciones guardar(@Valid @RequestBody Calificaciones calificaciones) {
        return this.calificacionesRepositorio.save(calificaciones);
    }

    @GetMapping("/")
    public List<Calificaciones> seleccionar() {
        return this.calificacionesRepositorio.findAll();
    }
}
