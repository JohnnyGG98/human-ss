package com.shopshopista.humanss.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.shopshopista.humanss.model.Persona;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {

	@Transactional
    @Modifying
    @Query(value = "UPDATE Personas p SET p.per_activo = false WHERE p = :persona")
    void eliminarPersona(@Param("persona") Persona persona);

	
	

}
