package com.shopshopista.humanss.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(
        name = "\"Clientes\"",
        schema = "human"
)
@PrimaryKeyJoinColumn(name = "id_cliente", foreignKey = @ForeignKey(name = "fk_cliente_persona"))
public class Cliente extends Persona implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "cli_fecha_nacimiento", nullable = false)
    private LocalDate cli_fecha_nacimiento;

    @Column(name = "cli_activo", nullable = false, columnDefinition = "boolean DEFAULT 'true'")
    private Boolean cli_activo = true;

    public Cliente() {
        super();
    }

    
	public Cliente(Long id_persona, Usuario usuario, TipoIdentificacion tipoIdentificacion, String per_identificacion,
			String per_primer_nombre, String per_segundo_nombre, String per_primer_apellido,
			String per_segundo_apellido, String per_correo, String per_sexo, LocalDateTime per_fecha_registro,
			Boolean per_activo, String cli_fecha_nacimiento, Boolean cli_activo) {
		super(id_persona, usuario, tipoIdentificacion, per_identificacion, per_primer_nombre, per_segundo_nombre,
				per_primer_apellido, per_segundo_apellido, per_correo, per_sexo, per_fecha_registro, per_activo);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		this.cli_fecha_nacimiento = LocalDate.parse(cli_fecha_nacimiento,formatter);
		this.cli_activo = cli_activo;
	}







	public LocalDate getCli_fecha_nacimiento() {
        return cli_fecha_nacimiento;
    }

    public void setCli_fecha_nacimiento(String cli_fecha_nacimiento) {
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-dd");
        this.cli_fecha_nacimiento = LocalDate.parse(cli_fecha_nacimiento,formatter);
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "Cliente [cli_fecha_nacimiento=" + cli_fecha_nacimiento + ", cli_activo=" + cli_activo + ", toString()="
                + super.toString() + "]";
    }

}
