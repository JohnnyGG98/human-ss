//package com.shopshopista.humanss.controller.v1;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.shopshopista.humanss.model.Preferencias;
//import com.shopshopista.humanss.repository.IPreferenciasRepository;
//
//@RestController
//public class PreferenciasController {
//
//	@Autowired
//	private IPreferenciasRepository preferenciaRepository;
//	
//	@PostMapping("/")
//    @ResponseBody
//    public Preferencias guardar(@RequestBody Preferencias preferencias) {
//        return this.preferenciaRepository.save(preferencias);
//    }
//	
//}
