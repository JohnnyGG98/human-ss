package com.shopshopista.humanss.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;


@Entity
@Table(name="\"Clientes\"")
@PrimaryKeyJoinColumn(name = "id_cliente", foreignKey=@ForeignKey(name = "fk_cliente_persona") )
public class Cliente extends Persona implements Serializable {

	private static final long serialVersionUID = 1L;
		
	@Column(name = "cli_fecha_nacimiento" , nullable = false)
	private LocalDate cli_fecha_nacimiento;

	public Cliente() {
		super();
	}

	
	public Cliente(Long id_persona, String per_identificacion, String per_primer_nombre, String per_segundo_nombre,
			String per_primer_apellido, String per_segundo_apellido, String per_correo, String per_sexo,
			LocalDateTime per_fecha_registo, LocalDate cli_fecha_nacimiento) {
		super(id_persona, per_identificacion, per_primer_nombre, per_segundo_nombre, per_primer_apellido,
				per_segundo_apellido, per_correo, per_sexo, per_fecha_registo);
		this.cli_fecha_nacimiento = cli_fecha_nacimiento;
	}


	public LocalDate getCli_fecha_nacimiento() {
		return cli_fecha_nacimiento;
	}

	public void setCli_fecha_nacimiento(LocalDate cli_fecha_nacimiento) {
		this.cli_fecha_nacimiento = cli_fecha_nacimiento;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Cliente [cli_fecha_nacimiento=" + cli_fecha_nacimiento + ", toString()=" + super.toString() + "]";
	}
	

}
