//package com.shopshopista.humanss.model;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "Calificaciones")
//public class Calificaciones {
//
//	private static final long serialVersionUID = 1L;
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name = "id_calificacion")
//	private Long id_calificacion;
//
//	
//	// ejemplo de foreing Key
//	@Column(name = "id_cliente", table = "Cliente" ,nullable = false)
//	private Long id_cliente;
//
//	@Column(name = "id_producto", nullable = false)
//	private Long id_producto;
//
//	@Column(name = "calificacion", columnDefinition = "NUMERIC(2, 2)")
//	private Double calificacion;
//
//	@Column(name = "cal_activo", columnDefinition="DEFAULT 'true'")
//	private Boolean cal_activo;
//
//	public Calificaciones() {
//
//	}
//
//	public Calificaciones(Long id_calificacion, Long id_cliente, Long id_producto, Double calificacion,
//			Boolean cal_activo) {
//		
//		this.id_calificacion = id_calificacion;
//		this.id_cliente = id_cliente;
//		this.id_producto = id_producto;
//		this.calificacion = calificacion;
//		this.cal_activo = cal_activo;
//	}
//
//	public Long getId_calificacion() {
//		return id_calificacion;
//	}
//
//	public void setId_calificacion(Long id_calificacion) {
//		this.id_calificacion = id_calificacion;
//	}
//
//	public Long getId_cliente() {
//		return id_cliente;
//	}
//
//	public void setId_cliente(Long id_cliente) {
//		this.id_cliente = id_cliente;
//	}
//
//	public Long getId_producto() {
//		return id_producto;
//	}
//
//	public void setId_producto(Long id_producto) {
//		this.id_producto = id_producto;
//	}
//
//	public Double getCalificacion() {
//		return calificacion;
//	}
//
//	public void setCalificacion(Double calificacion) {
//		this.calificacion = calificacion;
//	}
//
//	public Boolean getCal_activo() {
//		return cal_activo;
//	}
//
//	public void setCal_activo(Boolean cal_activo) {
//		this.cal_activo = cal_activo;
//	}
//
//	public static long getSerialversionuid() {
//		return serialVersionUID;
//	}
//
//	@Override
//	public String toString() {
//		return "Calificaciones [id_calificacion=" + id_calificacion + ", id_cliente=" + id_cliente + ", id_producto="
//				+ id_producto + ", calificacion=" + calificacion + ", cal_activo=" + cal_activo + "]";
//	}
//
//	
//
//}
