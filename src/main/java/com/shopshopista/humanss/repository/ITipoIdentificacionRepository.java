package com.shopshopista.humanss.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopshopista.humanss.model.persona.TipoIdentificacion;

public interface ITipoIdentificacionRepository extends JpaRepository<TipoIdentificacion, Long> {

}
