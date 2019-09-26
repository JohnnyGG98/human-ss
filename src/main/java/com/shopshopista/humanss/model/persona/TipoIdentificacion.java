package com.shopshopista.humanss.model.persona;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Where;

@Where(clause = "tiid_activo = true")
@Entity(
        name = "TipoIdentificacion"
)
@Table(
        name = "\"TiposIdentificacion\"",
        schema = "human"
)
public class TipoIdentificacion implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_identificacion")
    private Long id_tipo_identificacion;

    @Column(name = "tiid_nombre", length = 10)
    private String tiid_nombre;

    @Column(name = "tiid_activo", nullable = false, columnDefinition = "boolean DEFAULT 'true'")
    private Boolean tiid_activo = true;

    public TipoIdentificacion() {

    }

    public TipoIdentificacion(Long id_tipo_identificacion, String tiid_nombre, Boolean tiid_activo) {
        this.id_tipo_identificacion = id_tipo_identificacion;
        this.tiid_nombre = tiid_nombre;
        this.tiid_activo = tiid_activo;
    }

    public Long getId_tipo_identificacion() {
        return id_tipo_identificacion;
    }

    public void setId_tipo_identificacion(Long id_tipo_identificacion) {
        this.id_tipo_identificacion = id_tipo_identificacion;
    }

    public String getTiid_nombre() {
        return tiid_nombre;
    }

    public void setTiid_nombre(String tiid_nombre) {
        this.tiid_nombre = tiid_nombre;
    }

    public Boolean getTiid_activo() {
        return tiid_activo;
    }

    public void setTiid_activo(Boolean tiid_activo) {
        this.tiid_activo = tiid_activo;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}
