package com.shopshopista.humanss.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ForeignKey;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.Entity;
import org.hibernate.annotations.Where;

@Entity(name = "Vendedores")
@Table(
        name = "\"Vendedores\"",
        schema = "human"
)
@PrimaryKeyJoinColumn(name = "id_vendedor", foreignKey = @ForeignKey(name = "fk_vendedor_persona"))
@Where(clause = "vend_activo = true")
public class Vendedor extends Persona implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "vend_max_productos", nullable = false)
    private Integer vend_max_productos;

    @Column(name = "vend_activo", nullable = false, columnDefinition = "boolean DEFAULT 'true'")
    private Boolean vend_activo = true;

    @JsonManagedReference
    @OneToMany(mappedBy = "vendedor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Local> localesVendedor;

    public Vendedor() {
        super();
    }

    public Vendedor(Long id_persona, Usuario usuario, TipoIdentificacion tipoIdentificacion, String per_identificacion,
            String per_primer_nombre, String per_segundo_nombre, String per_primer_apellido,
            String per_segundo_apellido, String per_correo, String per_sexo, LocalDateTime per_fecha_registro,
            Boolean per_activo, Integer vend_max_productos, Boolean vend_activo, List<Local> localesVendedor) {
        super(id_persona, usuario, tipoIdentificacion, per_identificacion, per_primer_nombre, per_segundo_nombre,
                per_primer_apellido, per_segundo_apellido, per_correo, per_sexo, per_fecha_registro, per_activo);
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
