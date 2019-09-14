package com.shopshopista.humanss.model;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.shopshopista.humanss.model.producto.Productos;

@Entity
@Table(name = "\"ProductosDeseados\"")
public class ProductosDeseados {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	@Column(name = "id_producto_deseado")
	private Long id_producto_deseado;
	
	
	@JsonBackReference
	@JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente", foreignKey = @ForeignKey(name = "cliente_prodDeseado_fk"))
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Cliente cliente;
	
	@JsonBackReference
	@JoinColumn(name = "id_producto", referencedColumnName = "id_producto", foreignKey = @ForeignKey(name = "producto_prodDeseado_fk"))
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Productos producto;
	
	@Column(name = "prde_fecha_ingreso",  columnDefinition="DATE DEFAULT now()", nullable = false)
	private LocalDateTime prde_fecha_ingreso;
	
	@Column(name = "prde_activo", columnDefinition="DEFAULT 'true'", nullable = false)
	private Boolean prde_activo;

	public ProductosDeseados() {
		
	}

	public ProductosDeseados(Long id_producto_deseado, Cliente cliente, Productos producto,
			LocalDateTime prde_fecha_ingreso, Boolean prde_activo) {
		this.id_producto_deseado = id_producto_deseado;
		this.cliente = cliente;
		this.producto = producto;
		this.prde_fecha_ingreso = prde_fecha_ingreso;
		this.prde_activo = prde_activo;
	}

	public Long getId_producto_deseado() {
		return id_producto_deseado;
	}

	public void setId_producto_deseado(Long id_producto_deseado) {
		this.id_producto_deseado = id_producto_deseado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Productos getProducto() {
		return producto;
	}

	public void setProducto(Productos producto) {
		this.producto = producto;
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
		return "ProductosDeseados [id_producto_deseado=" + id_producto_deseado + ", prde_fecha_ingreso="
				+ prde_fecha_ingreso + ", prde_activo=" + prde_activo + "]";
	}
	
	

}