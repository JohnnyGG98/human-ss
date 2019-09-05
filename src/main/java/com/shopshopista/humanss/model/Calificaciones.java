package com.shopshopista.humanss.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Calificaciones")
public class Calificaciones {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_calificacion")
	private Long idCalificacion;

	@Column(name = "id_cliente", nullable = false)
	private Long idCliente;

	@Column(name = "id_producto", nullable = false)
	private Long idProducto;

	@Column(name = "calificacion", columnDefinition = "NUMERIC(2, 2)")
	private Double calificacion;

	@Column(name = "cal_activo")
	private Boolean calActivo;

	public Calificaciones() {

	}

	public Calificaciones(Long idCalificacion, Long idCliente, Long idProducto, Double calificacion,
			Boolean calActivo) {

		this.idCalificacion = idCalificacion;
		this.idCliente = idCliente;
		this.idProducto = idProducto;
		this.calificacion = calificacion;
		this.calActivo = calActivo;
	}

	public Long getIdCalificacion() {
		return idCalificacion;
	}

	public void setIdCalificacion(Long idCalificacion) {
		this.idCalificacion = idCalificacion;
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

	public Double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(Double calificacion) {
		this.calificacion = calificacion;
	}

	public Boolean getCalActivo() {
		return calActivo;
	}

	public void setCalActivo(Boolean calActivo) {
		this.calActivo = calActivo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Calificaciones [idCalificacion=" + idCalificacion + ", idCliente=" + idCliente + ", idProducto="
				+ idProducto + ", calificacion=" + calificacion + ", calActivo=" + calActivo + "]";
	}

}
