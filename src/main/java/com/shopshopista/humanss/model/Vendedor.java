package com.shopshopista.humanss.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "\"Vendedores\"")
@PrimaryKeyJoinColumn(name = "id_vendedor", foreignKey=@ForeignKey(name = "fk_vendedor_usuario"))
public class Vendedor extends Usuario implements Serializable {
	
	private static final long serialVersionUID = 1L;

	 
	@Column(name = "vend_max_productos",  nullable =false)	
	private Integer vend_max_productos;
	
	@Column(name = "vend_activo", nullable = false, columnDefinition = "boolean DEFAULT 'true'")
	private Boolean vend_activo = true;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "vendedor", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Local> localesVendedor;


	public Vendedor() {
		super();
	}
	

	public Vendedor(Long id_usuario, Persona persona, String user_nick, byte[] user_pass, Boolean user_activo,
			Integer vend_max_productos, Boolean vend_activo, List<Local> localesVendedor) {
		super(id_usuario, persona, user_nick, user_pass, user_activo);
		this.vend_max_productos = vend_max_productos;
		this.vend_activo = vend_activo;
		this.localesVendedor = localesVendedor;
	}





	public Integer getVend_max_productos() {
		return vend_max_productos;
	}

	public void setVend_max_productos(Integer vend_max_productos) {
		this.vend_max_productos = vend_max_productos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public List<Local> getLocalesVendedor() {
		return localesVendedor;
	}


	public void setLocalesVendedor(List<Local> localesVendedor) {
		this.localesVendedor = localesVendedor;
	}


	
	
	public Boolean getVend_activo() {
		return vend_activo;
	}


	public void setVend_activo(Boolean vend_activo) {
		this.vend_activo = vend_activo;
	}


	@Override
	public String toString() {
		return "Vendedor [vend_max_productos=" + vend_max_productos + ", vend_activo=" + vend_activo
				+ ", localesVendedor=" + localesVendedor + ", toString()=" + super.toString() + "]";
	}



	


	
}
