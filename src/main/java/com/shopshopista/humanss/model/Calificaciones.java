package com.shopshopista.humanss.model;

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
@Table(name = "\"Calificaciones\"")
public class Calificaciones {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_calificacion")
	private Long id_calificacion;

	@JsonBackReference
	@JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente", foreignKey = @ForeignKey(name = "cliente_fk"))
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Cliente cliente;
	
	@JsonBackReference
	@JoinColumn(name = "id_producto", referencedColumnName = "id_producto", foreignKey = @ForeignKey(name = "producto_calificaciones_fk"))
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Productos producto;

	@Column(name = "calificacion", columnDefinition = "NUMERIC(2, 2)")
	private Double calificacion;

	@Column(name = "cal_activo", columnDefinition = "DEFAULT 'true'")
	private Boolean cal_activo;

	public Calificaciones() {

	}

	public Calificaciones(Long id_calificacion, Cliente cliente, Productos producto, Double calificacion,
			Boolean cal_activo) {
		this.id_calificacion = id_calificacion;
		this.cliente = cliente;
		this.producto = producto;
		this.calificacion = calificacion;
		this.cal_activo = cal_activo;
	}

	public Long getId_calificacion() {
		return id_calificacion;
	}

	public void setId_calificacion(Long id_calificacion) {
		this.id_calificacion = id_calificacion;
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

	public Double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(Double calificacion) {
		this.calificacion = calificacion;
	}

	public Boolean getCal_activo() {
		return cal_activo;
	}

	public void setCal_activo(Boolean cal_activo) {
		this.cal_activo = cal_activo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Calificaciones [id_calificacion=" + id_calificacion + ", calificacion=" + calificacion + ", cal_activo="
				+ cal_activo + "]";
	}

}
