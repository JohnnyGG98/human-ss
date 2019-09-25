package com.shopshopista.humanss.repository.vendedor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.shopshopista.humanss.model.vendedor.Vendedor;

@Repository
public interface IVendedorRepository extends JpaRepository<Vendedor, Long> {

	@Transactional
	@Modifying
	@Query(value = "UPDATE Vendedores v SET v.vend_activo = false WHERE v.id_persona= :idVendedor")
	void eliminarVendedorPorId(@Param("idVendedor") Long idVendedor);
	
}
