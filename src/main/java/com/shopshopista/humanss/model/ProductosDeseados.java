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
	private Long idProductoDeseado;
	
	@Column(name = "id_cliente", nullable = false)
	private Long idCliente;
	
	@Column(name = "id_producto", nullable = false)
	private Long idProducto;
	
	@Column(name = "prde_fecha_ingreso",  columnDefinition="DATE DEFAULT now()", nullable = false)
	private LocalDateTime proDesFechaIngreso;
	
	@Column(name = "prde_activo", nullable = false)
	private Boolean proDesActivo;

	public ProductosDeseados() {
		
	}

	public ProductosDeseados(Long idProductoDeseado, Long idCliente, Long idProducto, LocalDateTime proDesFechaIngreso,
			Boolean proDesActivo) {
		
		this.idProductoDeseado = idProductoDeseado;
		this.idCliente = idCliente;
		this.idProducto = idProducto;
		this.proDesFechaIngreso = proDesFechaIngreso;
		this.proDesActivo = proDesActivo;
	}

	public Long getIdProductoDeseado() {
		return idProductoDeseado;
	}

	public void setIdProductoDeseado(Long idProductoDeseado) {
		this.idProductoDeseado = idProductoDeseado;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public LocalDateTime getProDesFechaIngreso() {
		return proDesFechaIngreso;
	}

	public void setProDesFechaIngreso(LocalDateTime proDesFechaIngreso) {
		this.proDesFechaIngreso = proDesFechaIngreso;
	}

	public Boolean getProDesActivo() {
		return proDesActivo;
	}

	public void setProDesActivo(Boolean proDesActivo) {
		this.proDesActivo = proDesActivo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "ProductosDeseados [idProductoDeseado=" + idProductoDeseado + ", idCliente=" + idCliente
				+ ", idProducto=" + idProducto + ", proDesFechaIngreso=" + proDesFechaIngreso + ", proDesActivo="
				+ proDesActivo + "]";
	}
	
	
}
