package com.shopshopista.humanss.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopshopista.humanss.model.Calificaciones;

@Repository
public interface ICalificacionesRepository extends JpaRepository<Calificaciones, Long> {

}
