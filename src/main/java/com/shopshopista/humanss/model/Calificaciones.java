package com.shopshopista.humanss.model;

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
import org.hibernate.annotations.Where;

@Where(clause = "cal_activo = true")
@Entity(
        name = "Calificaciones"
)
@Table(
        name = "\"Calificaciones\"",
        schema = "human"
)
public class Calificaciones implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_calificacion")
    private Long id_calificacion;

    @JsonBackReference
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente", foreignKey = @ForeignKey(name = "cliente_fk"))
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Cliente cliente;

    @Column(name = "id_producto")
    private Long id_producto;

    @Column(name = "calificacion", columnDefinition = "NUMERIC(2, 2)")
    private Double calificacion;

    @Column(name = "cal_activo", columnDefinition = "BOOLEAN DEFAULT 'true'")
    private Boolean cal_activo = true;

    public Calificaciones() {

    }

    public Calificaciones(Long id_calificacion, Cliente cliente, Long id_producto, Double calificacion, Boolean cal_activo) {
        this.id_calificacion = id_calificacion;
        this.cliente = cliente;
        this.id_producto = id_producto;
        this.calificacion = calificacion;
        this.cal_activo = cal_activo;
    }

    public Long getId_calificacion() {
        return id_calificacion;
    }

    public void setId_calificacion(Long id_calificacion) {
        this.id_calificacion = id_calificacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Long getId_producto() {
        return id_producto;
    }

    public void setId_producto(Long id_producto) {
        this.id_producto = id_producto;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

    public Boolean getCal_activo() {
        return cal_activo;
    }

    public void setCal_activo(Boolean cal_activo) {
        this.cal_activo = cal_activo;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "Calificaciones{" + "id_calificacion=" + id_calificacion + ", cliente=" + cliente + ", id_producto=" + id_producto + ", calificacion=" + calificacion + ", cal_activo=" + cal_activo + '}';
    }

}
