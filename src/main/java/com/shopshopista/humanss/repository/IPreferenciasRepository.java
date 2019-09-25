package com.shopshopista.humanss.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopshopista.humanss.model.cliente.Preferencias;

@Repository
public interface IPreferenciasRepository extends JpaRepository<Preferencias, Long> {

	
}
