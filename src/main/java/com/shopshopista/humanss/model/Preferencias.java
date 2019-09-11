//package com.shopshopista.humanss.model;
//
//import java.time.LocalDateTime;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "Preferencias")
//public class Preferencias {
//	
//	private static final long serialVersionUID = 1L;
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)	
//	@Column(name = "id_preferencia")
//	private Long id_preferencia;
//	
//	@Column(name = "id_cliente", nullable = false)
//	private Long id_cliente;
//	
//	@Column(name = "id_categoria", nullable = false)
//	private Long id_categoria;
//	
//	@Column(name = "pref_fecha_ingreso", columnDefinition="DATE DEFAULT now()", nullable = false)
//	private LocalDateTime pref_fecha_ingreso;
//	
//	@Column(name = "pref_activo", columnDefinition="DEFAULT 'true'", nullable = false)
//	private Boolean pref_activo;
//
//	public Preferencias() {
//		
//	}
//
//	public Preferencias(Long id_preferencia, Long id_cliente, Long id_categoria, LocalDateTime pref_fecha_ingreso,
//			Boolean pref_activo) {
//		
//		this.id_preferencia = id_preferencia;
//		this.id_cliente = id_cliente;
//		this.id_categoria = id_categoria;
//		this.pref_fecha_ingreso = pref_fecha_ingreso;
//		this.pref_activo = pref_activo;
//	}
//
//	public Long getId_preferencia() {
//		return id_preferencia;
//	}
//
//	public void setId_preferencia(Long id_preferencia) {
//		this.id_preferencia = id_preferencia;
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
//	public Long getId_categoria() {
//		return id_categoria;
//	}
//
//	public void setId_categoria(Long id_categoria) {
//		this.id_categoria = id_categoria;
//	}
//
//	public LocalDateTime getPref_fecha_ingreso() {
//		return pref_fecha_ingreso;
//	}
//
//	public void setPref_fecha_ingreso(LocalDateTime pref_fecha_ingreso) {
//		this.pref_fecha_ingreso = pref_fecha_ingreso;
//	}
//
//	public Boolean getPref_activo() {
//		return pref_activo;
//	}
//
//	public void setPref_activo(Boolean pref_activo) {
//		this.pref_activo = pref_activo;
//	}
//
//	public static long getSerialversionuid() {
//		return serialVersionUID;
//	}
//
//	@Override
//	public String toString() {
//		return "Preferencias [id_preferencia=" + id_preferencia + ", id_cliente=" + id_cliente + ", id_categoria="
//				+ id_categoria + ", pref_fecha_ingreso=" + pref_fecha_ingreso + ", pref_activo=" + pref_activo + "]";
//	}
//
//	
//}
