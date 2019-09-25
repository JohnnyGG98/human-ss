package com.shopshopista.humanss.repository.cliente;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopshopista.humanss.model.persona.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Long> {

	
}
