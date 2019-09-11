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
//@Table(name = "Recomendaciones")
//public class Recomendaciones {
//	
//	private static final long serialVersionUID = 1L;
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)	
//	@Column(name = "id_recomendacion")
//	private Long id_recomendacion;
//	
//	@Column(name = "id_cliente", nullable = false)
//	private Long id_cliente;
//	
//	@Column(name = "recomendacion", length = 255, nullable = false)
//	private String recomendacion;
//	
//	@Column(name = "reco_activo", columnDefinition="DEFAULT 'true'", nullable = false)
//	private Boolean reco_activo;
//
//	public Recomendaciones() {
//		
//	}
//
//	public Recomendaciones(Long id_recomendacion, Long id_cliente, String recomendacion, Boolean reco_activo) {
//		
//		this.id_recomendacion = id_recomendacion;
//		this.id_cliente = id_cliente;
//		this.recomendacion = recomendacion;
//		this.reco_activo = reco_activo;
//	}
//
//	public Long getId_recomendacion() {
//		return id_recomendacion;
//	}
//
//	public void setId_recomendacion(Long id_recomendacion) {
//		this.id_recomendacion = id_recomendacion;
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
//	public String getRecomendacion() {
//		return recomendacion;
//	}
//
//	public void setRecomendacion(String recomendacion) {
//		this.recomendacion = recomendacion;
//	}
//
//	public Boolean getReco_activo() {
//		return reco_activo;
//	}
//
//	public void setReco_activo(Boolean reco_activo) {
//		this.reco_activo = reco_activo;
//	}
//
//	public static long getSerialversionuid() {
//		return serialVersionUID;
//	}
//
//	@Override
//	public String toString() {
//		return "Recomendaciones [id_recomendacion=" + id_recomendacion + ", id_cliente=" + id_cliente
//				+ ", recomendacion=" + recomendacion + ", reco_activo=" + reco_activo + "]";
//	}
//
//	
//	
//}
