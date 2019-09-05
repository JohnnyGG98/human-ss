package com.shopshopista.humanss.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ProductosDeseados")
public class ProductosDeseados {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	@Column(name = "id_producto_deseado")
	private Long id_producto_deseado;
	
	@Column(name = "id_cliente", nullable = false)
	private Long id_cliente;
	
	@Column(name = "id_producto", nullable = false)
	private Long id_producto;
	
	@Column(name = "prde_fecha_ingreso",  columnDefinition="DATE DEFAULT now()", nullable = false)
	private LocalDateTime prde_fecha_ingreso;
	
	@Column(name = "prde_activo", columnDefinition="DEFAULT 'true'", nullable = false)
	private Boolean prde_activo;

	public ProductosDeseados() {
		
	}

	public ProductosDeseados(Long id_producto_deseado, Long id_cliente, Long id_producto,
			LocalDateTime prde_fecha_ingreso, Boolean prde_activo) {
		
		this.id_producto_deseado = id_producto_deseado;
		this.id_cliente = id_cliente;
		this.id_producto = id_producto;
		this.prde_fecha_ingreso = prde_fecha_ingreso;
		this.prde_activo = prde_activo;
	}

	public Long getId_producto_deseado() {
		return id_producto_deseado;
	}

	public void setId_producto_deseado(Long id_producto_deseado) {
		this.id_producto_deseado = id_producto_deseado;
	}

	public Long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}

	public Long getId_producto() {
		return id_producto;
	}

	public void setId_producto(Long id_producto) {
		this.id_producto = id_producto;
	}

	public LocalDateTime getPrde_fecha_ingreso() {
		return prde_fecha_ingreso;
	}

	public void setPrde_fecha_ingreso(LocalDateTime prde_fecha_ingreso) {
		this.prde_fecha_ingreso = prde_fecha_ingreso;
	}

	public Boolean getPrde_activo() {
		return prde_activo;
	}

	public void setPrde_activo(Boolean prde_activo) {
		this.prde_activo = prde_activo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "ProductosDeseados [id_producto_deseado=" + id_producto_deseado + ", id_cliente=" + id_cliente
				+ ", id_producto=" + id_producto + ", prde_fecha_ingreso=" + prde_fecha_ingreso + ", prde_activo="
				+ prde_activo + "]";
	}
	
}
