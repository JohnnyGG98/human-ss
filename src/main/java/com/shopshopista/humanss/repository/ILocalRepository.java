package com.shopshopista.humanss.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopshopista.humanss.model.vendedor.Local;

public interface ILocalRepository extends JpaRepository<Local, Long> {

	
}
