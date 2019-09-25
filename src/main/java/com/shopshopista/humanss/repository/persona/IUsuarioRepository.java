package com.shopshopista.humanss.repository.persona;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopshopista.humanss.model.persona.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long>
{

}
