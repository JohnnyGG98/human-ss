package com.shopshopista.humanss.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopshopista.humanss.model.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Long> {

	
}
