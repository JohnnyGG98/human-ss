package com.shopshopista.humanss.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Recomendaciones")
public class Recomendaciones {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	@Column(name = "id_recomendacion")
	private Long idRecomendacion;
	
	@Column(name = "id_cliente", nullable = false)
	private Long idCliente;
	
	@Column(name = "recomendacion", length = 255, nullable = false)
	private String recomendacion;
	
	@Column(name = "reco_activo", nullable = false)
	private Boolean recoActivo;

	public Recomendaciones() {
		
	}

	public Recomendaciones(Long idRecomendacion, Long idCliente, String recomendacion, Boolean recoActivo) {
		
		this.idRecomendacion = idRecomendacion;
		this.idCliente = idCliente;
		this.recomendacion = recomendacion;
		this.recoActivo = recoActivo;
	}

	public Long getIdRecomendacion() {
		return idRecomendacion;
	}

	public void setIdRecomendacion(Long idRecomendacion) {
		this.idRecomendacion = idRecomendacion;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public String getRecomendacion() {
		return recomendacion;
	}

	public void setRecomendacion(String recomendacion) {
		this.recomendacion = recomendacion;
	}

	public Boolean getRecoActivo() {
		return recoActivo;
	}

	public void setRecoActivo(Boolean recoActivo) {
		this.recoActivo = recoActivo;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Recomendaciones [idRecomendacion=" + idRecomendacion + ", idCliente=" + idCliente + ", recomendacion="
				+ recomendacion + ", recoActivo=" + recoActivo + "]";
	}
	
	
}
