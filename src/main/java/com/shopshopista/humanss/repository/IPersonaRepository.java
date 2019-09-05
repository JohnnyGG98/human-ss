package com.shopshopista.humanss.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopshopista.humanss.model.Persona;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {

	
}
