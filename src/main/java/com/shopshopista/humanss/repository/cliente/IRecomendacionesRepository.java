package com.shopshopista.humanss.repository.cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopshopista.humanss.model.cliente.Recomendaciones;

@Repository
public interface IRecomendacionesRepository extends JpaRepository<Recomendaciones, Long> {

}
