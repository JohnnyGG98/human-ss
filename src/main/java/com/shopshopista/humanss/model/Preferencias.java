package com.shopshopista.humanss.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Preferencias")
public class Preferencias {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	@Column(name = "id_preferencia")
	private Long idPreferencia;
	
	@Column(name = "id_cliente", nullable = false)
	private Long idCliente;
	
	@Column(name = "id_categoria", nullable = false)
	private Long idCategoria;
	
	@Column(name = "pref_fecha_ingreso", columnDefinition="DATE DEFAULT now()", nullable = false)
	private LocalDateTime prefeFechaIngreso;
	
	@Column(name = "pref_activo", nullable = false)
	private Boolean preferenciaActivo;

	public Preferencias() {
		
	}

	public Preferencias(Long idPreferencia, Long idCliente, Long idCategoria, LocalDateTime prefeFechaIngreso,
			Boolean preferenciaActivo) {
		
		this.idPreferencia = idPreferencia;
		this.idCliente = idCliente;
		this.idCategoria = idCategoria;
		this.prefeFechaIngreso = prefeFechaIngreso;
		this.preferenciaActivo = preferenciaActivo;
	}

	public Long getIdPreferencia() {
		return idPreferencia;
	}

	public void setIdPreferencia(Long idPreferencia) {
		this.idPreferencia = idPreferencia;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public Long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public LocalDateTime getPrefeFechaIngreso() {
		return prefeFechaIngreso;
	}

	public void setPrefeFechaIngreso(LocalDateTime prefeFechaIngreso) {
		this.prefeFechaIngreso = prefeFechaIngreso;
	}

	public Boolean getPreferenciaActivo() {
		return preferenciaActivo;
	}

	public void setPreferenciaActivo(Boolean preferenciaActivo) {
		this.preferenciaActivo = preferenciaActivo;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Preferencias [idPreferencia=" + idPreferencia + ", idCliente=" + idCliente + ", idCategoria="
				+ idCategoria + ", prefeFechaIngreso=" + prefeFechaIngreso + ", preferenciaActivo=" + preferenciaActivo
				+ "]";
	}
	
	
}
