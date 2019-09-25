package com.shopshopista.humanss.repository.cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopshopista.humanss.model.cliente.ProductosDeseados;

@Repository
public interface IProductosDeseadosRepository extends JpaRepository<ProductosDeseados, Long> {

}
