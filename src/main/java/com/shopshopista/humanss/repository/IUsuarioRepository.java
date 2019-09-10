package com.shopshopista.humanss.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopshopista.humanss.model.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long>
{

}
