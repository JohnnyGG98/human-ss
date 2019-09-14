package com.shopshopista.humanss.model;

import java.time.LocalDate;

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
import com.shopshopista.humanss.model.producto.Categorias;

@Entity
@Table(name = "\"Preferencias\"")
public class Preferencias {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	@Column(name = "id_preferencia")
	private Long id_preferencia;
	
	@JsonBackReference
	@JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente", foreignKey = @ForeignKey(name = "cliente_preferencia_fk"))
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Cliente cliente;
	
	@JsonBackReference
	@JoinColumn(name = "id_categoria", referencedColumnName = "id_categoria", foreignKey = @ForeignKey(name = "categoria_fk"))
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Categorias categoria;
	
	@Column(name = "pref_fecha_ingreso", columnDefinition="DATE DEFAULT now()", nullable = false)
	private LocalDate pref_fecha_ingreso;
	
	@Column(name = "pref_activo", columnDefinition="DEFAULT 'true'", nullable = false)
	private Boolean pref_activo;

	public Preferencias() {
		
	}

	public Preferencias(Long id_preferencia, Cliente cliente, Categorias categoria, LocalDate pref_fecha_ingreso,
			Boolean pref_activo) {
		this.id_preferencia = id_preferencia;
		this.cliente = cliente;
		this.categoria = categoria;
		this.pref_fecha_ingreso = pref_fecha_ingreso;
		this.pref_activo = pref_activo;
	}

	public Long getId_preferencia() {
		return id_preferencia;
	}

	public void setId_preferencia(Long id_preferencia) {
		this.id_preferencia = id_preferencia;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Categorias getCategoria() {
		return categoria;
	}

	public void setCategoria(Categorias categoria) {
		this.categoria = categoria;
	}

	public LocalDate getPref_fecha_ingreso() {
		return pref_fecha_ingreso;
	}

	public void setPref_fecha_ingreso(LocalDate pref_fecha_ingreso) {
		this.pref_fecha_ingreso = pref_fecha_ingreso;
	}

	public Boolean getPref_activo() {
		return pref_activo;
	}

	public void setPref_activo(Boolean pref_activo) {
		this.pref_activo = pref_activo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Preferencias [id_preferencia=" + id_preferencia + ", pref_fecha_ingreso=" + pref_fecha_ingreso
				+ ", pref_activo=" + pref_activo + "]";
	}
        
}
