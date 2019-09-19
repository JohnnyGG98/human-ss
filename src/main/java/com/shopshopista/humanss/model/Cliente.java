package com.shopshopista.humanss.model;

import java.io.Serializable;
import java.time.LocalDate;

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
@PrimaryKeyJoinColumn(name = "id_cliente", foreignKey = @ForeignKey(name = "fk_cliente_usuario"))
public class Cliente extends Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "cli_fecha_nacimiento", nullable = false)
    private LocalDate cli_fecha_nacimiento;

    @Column(name = "cli_activo", nullable = false, columnDefinition = "boolean DEFAULT 'true'")
    private Boolean cli_activo = true;

    public Cliente() {
        super();
    }

    public Cliente(Long id_usuario, Persona persona, String user_nick, byte[] user_pass, Boolean user_activo,
            LocalDate cli_fecha_nacimiento, Boolean cli_activo) {
        super(id_usuario, persona, user_nick, user_pass, user_activo);
        this.cli_fecha_nacimiento = cli_fecha_nacimiento;
        this.cli_activo = cli_activo;
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
        return "Cliente [cli_fecha_nacimiento=" + cli_fecha_nacimiento + ", cli_activo=" + cli_activo + ", toString()="
                + super.toString() + "]";
    }

}
