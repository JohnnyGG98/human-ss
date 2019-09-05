package com.shopshopista.humanss.model;

import java.io.Serializable;
import java.time.LocalDate;

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
	private Long idPersona;

	@Column(name = "per_identificacion", length = 15, nullable = false)
	private String identificacionPersona;

	@Column(name = "per_primer_nombre", columnDefinition = "character varying(75) DEFAULT ''")
	private String primerNombrePersona;

	@Column(name = "per_segundo_nombre", length = 75, nullable = false)
	private String segundoNombrePersona;

	@Column(name = "per_primer_apellido", length = 75, nullable = false)
	private String primerApellidoPersona;

	@Column(name = "per_segundo_apellido", length = 75)
	private String segundoApellidoPersona;

	@Column(name = "per_correo", length = 50, nullable = false)
	private String correoElectronicoPersona;

	@Column(name = "per_sexo", length = 50, nullable = false)
	private String sexoPersona;

	@Column(name = "per_fecha_registo", columnDefinition = "timestamp DEFAULT now()")
	private LocalDate fechaRegistroPersona;

	public Persona() {

	}

	public Persona(Long idPersona, String identificacionPersona, String primerNombrePersona,
			String segundoNombrePersona, String primerApellidoPersona, String segundoApellidoPersona,
			String correoElectronicoPersona, String sexoPersona, LocalDate fechaRegistroPersona) {

		this.idPersona = idPersona;
		this.identificacionPersona = identificacionPersona;
		this.primerNombrePersona = primerNombrePersona;
		this.segundoNombrePersona = segundoNombrePersona;
		this.primerApellidoPersona = primerApellidoPersona;
		this.segundoApellidoPersona = segundoApellidoPersona;
		this.correoElectronicoPersona = correoElectronicoPersona;
		this.sexoPersona = sexoPersona;
		this.fechaRegistroPersona = fechaRegistroPersona;
	}

	public Long getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}

	public String getIdentificacionPersona() {
		return identificacionPersona;
	}

	public void setIdentificacionPersona(String identificacionPersona) {
		this.identificacionPersona = identificacionPersona;
	}

	public String getPrimerNombrePersona() {
		return primerNombrePersona;
	}

	public void setPrimerNombrePersona(String primerNombrePersona) {
		this.primerNombrePersona = primerNombrePersona;
	}

	public String getSegundoNombrePersona() {
		return segundoNombrePersona;
	}

	public void setSegundoNombrePersona(String segundoNombrePersona) {
		this.segundoNombrePersona = segundoNombrePersona;
	}

	public String getPrimerApellidoPersona() {
		return primerApellidoPersona;
	}

	public void setPrimerApellidoPersona(String primerApellidoPersona) {
		this.primerApellidoPersona = primerApellidoPersona;
	}

	public String getSegundoApellidoPersona() {
		return segundoApellidoPersona;
	}

	public void setSegundoApellidoPersona(String segundoApellidoPersona) {
		this.segundoApellidoPersona = segundoApellidoPersona;
	}

	public String getCorreoElectronicoPersona() {
		return correoElectronicoPersona;
	}

	public void setCorreoElectronicoPersona(String correoElectronicoPersona) {
		this.correoElectronicoPersona = correoElectronicoPersona;
	}

	public String getSexoPersona() {
		return sexoPersona;
	}

	public void setSexoPersona(String sexoPersona) {
		this.sexoPersona = sexoPersona;
	}

	public LocalDate getFechaRegistroPersona() {
		return fechaRegistroPersona;
	}

	public void setFechaRegistroPersona(LocalDate fechaRegistroPersona) {
		this.fechaRegistroPersona = fechaRegistroPersona;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", identificacionPersona=" + identificacionPersona
				+ ", primerNombrePersona=" + primerNombrePersona + ", segundoNombrePersona=" + segundoNombrePersona
				+ ", primerApellidoPersona=" + primerApellidoPersona + ", segundoApellidoPersona="
				+ segundoApellidoPersona + ", correoElectronicoPersona=" + correoElectronicoPersona + ", sexoPersona="
				+ sexoPersona + ", fechaRegistroPersona=" + fechaRegistroPersona + "]";
	}

}
