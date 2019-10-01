package com.shopshopista.humanss.model.cliente;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

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
import java.io.Serializable;

import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.FilterJoinTable;
import org.hibernate.annotations.Filters;
import org.hibernate.annotations.ParamDef;
import org.hibernate.annotations.Where;

@Where(clause = "pref_activo = true")
@Entity(
        name = "Preferencias"
)
@Table(
        name = "\"Preferencias\"",
        schema = "human"
)
@FilterDef(name = "buscarPorCliente", parameters = @ParamDef(name="id", type = "long"))
@Filters(@Filter(name = "buscarPorCliente" , condition = ":id=id_cliente"))

public class Preferencias implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_preferencia")
    private Long id_preferencia;

    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente", foreignKey = @ForeignKey(name = "cliente_preferencia_fk"))
    @ManyToOne(fetch = FetchType.LAZY)
    private Cliente cliente;

    @Column(name = "id_categoria", nullable=false)
    private Long id_categoria;

    @Column(name = "pref_fecha_ingreso", columnDefinition = "DATE DEFAULT now()", nullable = false)
    private LocalDateTime pref_fecha_ingreso= ZonedDateTime.now(ZoneId.of("America/Guayaquil")).toLocalDateTime();;

    @Column(name = "pref_activo", columnDefinition = "BOOLEAN DEFAULT 'true'", nullable = false)
    private Boolean pref_activo=true;

    public Preferencias() {

    }

    public Preferencias(Long id_preferencia, Cliente cliente, Long id_categoria, LocalDateTime pref_fecha_ingreso, Boolean pref_activo) {
        this.id_preferencia = id_preferencia;
        this.cliente = cliente;
        this.id_categoria = id_categoria;
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

    public Long getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(Long id_categoria) {
        this.id_categoria = id_categoria;
    }

    public LocalDateTime getPref_fecha_ingreso() {
        return pref_fecha_ingreso;
    }

    public void setPref_fecha_ingreso(LocalDateTime pref_fecha_ingreso) {
        this.pref_fecha_ingreso = pref_fecha_ingreso;
    }

    public Boolean getPref_activo() {
        return pref_activo;
    }

    public void setPref_activo(Boolean pref_activo) {
        this.pref_activo = pref_activo;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "Preferencias{" + "id_preferencia=" + id_preferencia + ", cliente=" + cliente + ", id_categoria=" + id_categoria + ", pref_fecha_ingreso=" + pref_fecha_ingreso + ", pref_activo=" + pref_activo + '}';
    }

}
