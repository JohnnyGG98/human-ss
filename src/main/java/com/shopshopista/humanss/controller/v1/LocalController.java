package com.shopshopista.humanss.controller.v1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopshopista.humanss.model.vendedor.Local;
import com.shopshopista.humanss.repository.ILocalRepository;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("api/v1/local")
public class LocalController {

    @Autowired
    private ILocalRepository localRepositorio;

    @PostMapping("/guardar")
    public Local insertar(@Valid @RequestBody Local local) {
        return this.localRepositorio.save(local);
    }

    @GetMapping("/")
    public List<Local> seleccionar() {
        return this.localRepositorio.findAll();
    }
}
