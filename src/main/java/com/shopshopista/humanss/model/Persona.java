package com.shopshopista.humanss.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Persona")
public class Persona implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_persona")
<<<<<<< HEAD
	private Long id_persona;	
	
	@Column(name = "per_identificacion", length = 15, nullable =false)	
	private String per_identificacion;
	
	@Column(name="per_primer_nombre", nullable = false )
	private String per_primer_nombre;
	
	@Column(name="per_segundo_nombre", length = 75, columnDefinition="character varying(75) DEFAULT ''")
	private String per_segundo_nombre;
	
	@Column(name="per_primer_apellido", length = 75, nullable =false)
	private String per_primer_apellido;
	
	@Column(name="per_segundo_apellido", length = 75, columnDefinition="character varying(75) DEFAULT ''")
	private String per_segundo_apellido;
	
	@Column(name="per_correo", length = 50, nullable =false)
	private String per_correo;
	
	@Column(name="per_sexo", length = 50, nullable =false)
	private String per_sexo;
	
	@Column(name="per_fecha_registo", columnDefinition="timestamp DEFAULT now()")
	private LocalDateTime per_fecha_registo;
	
	


	public Persona() {

	}




	public Persona(Long id_persona, String per_identificacion, String per_primer_nombre, String per_segundo_nombre,
			String per_primer_apellido, String per_segundo_apellido, String per_correo, String per_sexo,
			LocalDateTime per_fecha_registo) {
		this.id_persona = id_persona;
		this.per_identificacion = per_identificacion;
		this.per_primer_nombre = per_primer_nombre;
		this.per_segundo_nombre = per_segundo_nombre;
		this.per_primer_apellido = per_primer_apellido;
		this.per_segundo_apellido = per_segundo_apellido;
		this.per_correo = per_correo;
		this.per_sexo = per_sexo;
		this.per_fecha_registo = per_fecha_registo;
	}




	public Long getId_persona() {
		return id_persona;
	}




	public void setId_persona(Long id_persona) {
		this.id_persona = id_persona;
	}




	public String getPer_identificacion() {
		return per_identificacion;
	}




	public void setPer_identificacion(String per_identificacion) {
		this.per_identificacion = per_identificacion;
	}




	public String getPer_primer_nombre() {
		return per_primer_nombre;
	}




	public void setPer_primer_nombre(String per_primer_nombre) {
		this.per_primer_nombre = per_primer_nombre;
	}




	public String getPer_segundo_nombre() {
		return per_segundo_nombre;
	}




	public void setPer_segundo_nombre(String per_segundo_nombre) {
		this.per_segundo_nombre = per_segundo_nombre;
	}




	public String getPer_primer_apellido() {
		return per_primer_apellido;
	}




	public void setPer_primer_apellido(String per_primer_apellido) {
		this.per_primer_apellido = per_primer_apellido;
	}




	public String getPer_segundo_apellido() {
		return per_segundo_apellido;
	}




	public void setPer_segundo_apellido(String per_segundo_apellido) {
		this.per_segundo_apellido = per_segundo_apellido;
	}




	public String getPer_correo() {
		return per_correo;
	}




	public void setPer_correo(String per_correo) {
		this.per_correo = per_correo;
	}




	public String getPer_sexo() {
		return per_sexo;
	}




	public void setPer_sexo(String per_sexo) {
		this.per_sexo = per_sexo;
	}




	public LocalDateTime getPer_fecha_registo() {
		return per_fecha_registo;
	}




	public void setPer_fecha_registo(LocalDateTime per_fecha_registo) {
		this.per_fecha_registo = per_fecha_registo;
	}




	public static long getSerialversionuid() {
		return serialVersionUID;
	}




	@Override
	public String toString() {
		return "Persona [id_persona=" + id_persona + ", per_identificacion=" + per_identificacion
				+ ", per_primer_nombre=" + per_primer_nombre + ", per_segundo_nombre=" + per_segundo_nombre
				+ ", per_primer_apellido=" + per_primer_apellido + ", per_segundo_apellido=" + per_segundo_apellido
				+ ", per_correo=" + per_correo + ", per_sexo=" + per_sexo + ", per_fecha_registo=" + per_fecha_registo
				+ "]";
	}
	
	
	
	

}